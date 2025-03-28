(ns plc-simulator.model.plc-state
  (:require [clojure.spec.alpha :as s]))

;; Define specs for PLC components
(s/def ::address (s/and int? #(>= % 0)))
(s/def ::value boolean?)
(s/def ::io-point (s/keys :req-un [::address ::value]))
(s/def ::inputs (s/map-of ::address ::value))
(s/def ::outputs (s/map-of ::address ::value))
(s/def ::memory (s/map-of ::address ::value))
(s/def ::timer-value (s/and int? #(>= % 0)))
(s/def ::timer-preset (s/and int? #(>= % 0)))
(s/def ::timer-running boolean?)
(s/def ::timer (s/keys :req-un [::address ::timer-value ::timer-preset ::timer-running]))
(s/def ::timers (s/map-of ::address ::timer))
(s/def ::counter-value (s/and int? #(>= % 0)))
(s/def ::counter-preset (s/and int? #(>= % 0)))
(s/def ::counter (s/keys :req-un [::address ::counter-value ::counter-preset]))
(s/def ::counters (s/map-of ::address ::counter))
(s/def ::scan-time int?)
(s/def ::running boolean?)

;; Define the main PLC state spec
(s/def ::plc-state (s/keys :req-un [::inputs ::outputs ::memory ::timers ::counters
                                   ::scan-time ::running]))

;; Default initial state
(def initial-state
  {:inputs {0 true    ; Initialize input 0 to true for testing
            1 false   ; Initialize other inputs to false
            2 false
            3 false}
   :outputs {}   ; Maps output addresses to boolean values
   :memory {}    ; Maps memory addresses to boolean values
   :timers {}    ; Maps timer addresses to timer structures
   :counters {}  ; Maps counter addresses to counter structures
   :scan-time 100 ; Default scan time in milliseconds
   :running false}) ; Whether the PLC is running

;; Helper functions for working with PLC state
(defn get-input [state address]
  (if (nil? state)
    (do (println "ERROR: Nil state passed to get-input!")
        false)
    (let [inputs-map (get state :inputs)
          value (if (nil? inputs-map) 
                  (do (println "WARNING: No inputs map in state!")
                      false)
                  (get inputs-map address false))]
      (println "GET_INPUT CALLED - Address:" address 
               "Value:" value 
               "Inputs map:" (pr-str inputs-map)
               "Full state keys:" (keys state))
      value)))

(defn set-input [state address value]
  (println "Setting input" address "to" value)
  ;; Make sure inputs map exists before setting the value
  (let [inputs (get state :inputs {})
        new-inputs (assoc inputs address value)]
    (assoc state :inputs new-inputs)))

(defn get-output [state address]
  (get-in state [:outputs address] false))

(defn set-output [state address value]
  (assoc-in state [:outputs address] value))

(defn get-memory [state address]
  (get-in state [:memory address] false))

(defn set-memory [state address value]
  (assoc-in state [:memory address] value))

(defn get-timer [state address]
  (get-in state [:timers address]))

(defn set-timer [state address timer]
  (assoc-in state [:timers address] timer))

(defn get-counter [state address]
  (get-in state [:counters address]))

(defn set-counter [state address counter]
  (assoc-in state [:counters address] counter))

(defn set-running [state running?]
  (assoc state :running running?))

(defn set-scan-time [state scan-time]
  (assoc state :scan-time scan-time))

;; Create a new timer
(defn create-timer [address preset]
  {:address address
   :timer-value 0
   :timer-preset preset
   :timer-running false})

;; Create a new counter
(defn create-counter [address preset]
  {:address address
   :counter-value 0
   :counter-preset preset})