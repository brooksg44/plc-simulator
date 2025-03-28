(ns plc-simulator.core
  (:require [plc-simulator.ui.main-view :as ui]
            [plc-simulator.model.plc-state :as plc]
            [plc-simulator.model.ladder-logic :as ladder]
            [plc-simulator.engine.executor :as executor]
            [plc-simulator.ui.events :as events])
  (:gen-class))

;; Application state and components
(def app-state (atom nil))

(defn -main
  "Start the PLC Simulator application."
  [& args]
  (println "Starting PLC Simulator...")
  
  ;; Check initial state to make sure inputs are set correctly
  (println "Initial PLC state before UI start:" (:plc-state @events/*state))
  (println "Input 0 value:" (get-in @events/*state [:plc-state :inputs 0]))
  
  ;; Set input 0 to true explicitly
  (events/update-input 0 true)
  
  (let [app (ui/start-ui)]
    (reset! app-state app)
    (println "PLC Simulator started!")
    (println "Example program loaded:"
             (str "'" (:name ladder/example-program) "'"
                  " with " (count (:rungs ladder/example-program)) " rungs"))
    
    ;; Add a JVM shutdown hook
    (.addShutdownHook (Runtime/getRuntime)
                      (Thread. #(do
                                  (println "JVM shutdown hook triggered!")
                                  (when-let [control-chan (get @events/*state :control-chan)]
                                    (executor/stop-plc-execution control-chan)))))))

;; Function to get the current PLC state
(defn get-plc-state []
  (:plc-state @events/*state))

;; Function to set an input value
(defn set-input [address value]
  (events/update-input address value))

;; Function to get an input value
(defn get-input [address]
  (plc/get-input (get-plc-state) address))

;; Function to start the PLC
(defn start-plc []
  (when-not (:running (get-plc-state))
    (events/toggle-running nil)))

;; Function to stop the PLC
(defn stop-plc []
  (when (:running (get-plc-state))
    (events/toggle-running nil)))

;; Function to set the scan time
(defn set-scan-time [ms]
  (events/update-scan-time ms))