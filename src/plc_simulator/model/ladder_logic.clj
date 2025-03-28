(ns plc-simulator.model.ladder-logic
  (:require [clojure.spec.alpha :as s]))

;; Define specs for ladder logic elements

;; Element types
(s/def ::element-type #{:normally-open :normally-closed :output :timer :counter})

;; Address types
(s/def ::address-type #{:input :output :memory :timer :counter})

;; Basic element structure
(s/def ::address int?)
(s/def ::address-info (s/keys :req-un [::address-type ::address]))
(s/def ::element (s/keys :req-un [::element-type ::address-info]))

;; Rung structure (a sequence of elements)
(s/def ::elements (s/coll-of ::element))
(s/def ::name string?)
(s/def ::rung (s/keys :req-un [::name ::elements]))

;; Program structure (a sequence of rungs)
(s/def ::rungs (s/coll-of ::rung))
(s/def ::program (s/keys :req-un [::name ::rungs]))

;; Helper functions for creating ladder logic elements
(defn normally-open [address-type address]
  {:element-type :normally-open
   :address-info {:address-type address-type
                  :address address}})

(defn normally-closed [address-type address]
  {:element-type :normally-closed
   :address-info {:address-type address-type
                  :address address}})

(defn output [address-type address]
  {:element-type :output
   :address-info {:address-type address-type
                  :address address}})

(defn timer [address preset]
  {:element-type :timer
   :address-info {:address-type :timer
                  :address address}
   :preset preset})

(defn counter [address preset]
  {:element-type :counter
   :address-info {:address-type :counter
                  :address address}
   :preset preset})

;; Create a rung with a name and a sequence of elements
(defn create-rung [name elements]
  {:name name
   :elements elements})

;; Create a program with a name and a sequence of rungs
(defn create-program [name rungs]
  {:name name
   :rungs rungs})

;; Example ladder logic program
(def example-program
  (create-program "Example Program"
                 [(create-rung "Rung 1 - Input 0 to Output 0"
                              [(normally-open :input 0)  ;; Input 0 is always true in initialization
                               (output :output 0)])
                  (create-rung "Rung 2"
                              [(normally-open :input 1)
                               (normally-closed :output 0)
                               (output :output 1)])
                  (create-rung "Timer Example"
                              [(normally-open :input 2)
                               (timer 0 100)])  ;; Timer with preset of 100
                  (create-rung "Counter Example"
                              [(normally-open :input 3)
                               (counter 0 10)])])) ;; Counter with preset of 10