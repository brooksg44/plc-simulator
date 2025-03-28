(ns plc-simulator.ui.events
  (:require [plc-simulator.model.plc-state :as plc]
            [plc-simulator.model.ladder-logic :as ladder]
            [plc-simulator.engine.executor :as executor]))

;; State atom for the application
(def *state (atom {:plc-state (-> plc/initial-state
                                 (assoc-in [:inputs 0] true)
                                 (assoc-in [:inputs 1] false)
                                 (assoc-in [:inputs 2] false)
                                 (assoc-in [:inputs 3] false))
                   :program ladder/example-program
                   :control-chan nil}))

;; Event handler functions
(defn toggle-running [_]
  (println "Toggle running button clicked!")
  (let [running? (not (get-in @*state [:plc-state :running]))]
    (if running?
      ;; Start PLC execution
      (do
        (println "Starting PLC execution...")
        
        ;; Make sure inputs are properly set before passing the state
        (swap! *state update :plc-state 
               #(assoc % :inputs {0 true, 1 false, 2 false, 3 false}))
        
        ;; Debug the state before creating the atom
        (println "State before creating atom:" (pr-str (:plc-state @*state)))
        
        (let [plc-state-atom (atom (:plc-state @*state))
              program (:program @*state)
              _ (println "PLC state atom contents:" (pr-str @plc-state-atom))
              control-chan (executor/start-plc-execution plc-state-atom program)]
          ;; Start a background thread to update the UI
          (future
            (try
              (while (get-in @*state [:plc-state :running])
                (try
                  (let [new-state @plc-state-atom
                        _ (println "UI Update Thread - PLC state from executor:" 
                                   "outputs:" (pr-str (:outputs new-state)))]
                    
                    ;; Make sure the outputs map exists and output 0 is true for testing
                    (if (or (nil? (:outputs new-state)) (empty? (:outputs new-state)))
                      (do
                        (println "WARNING: Outputs map is empty or nil, creating new one")
                        (swap! *state update :plc-state #(assoc % :outputs {0 true})))
                      
                      ;; Use the state as-is if it has outputs
                      (do
                        (println "USING EXISTING OUTPUTS:" (pr-str (:outputs new-state)))
                        (swap! *state assoc :plc-state new-state))))
                  (Thread/sleep 100)
                  (catch Exception e
                    (println "Error updating UI:" (.getMessage e)))))
              (catch Exception e
                (println "Background thread error:" (.getMessage e)))))
          ;; Update state
          (swap! *state assoc-in [:plc-state :running] true)
          (swap! *state assoc :control-chan control-chan)))
      ;; Stop PLC execution
      (do
        (println "Stopping PLC execution...")
        (when-let [control-chan (:control-chan @*state)]
          (executor/stop-plc-execution control-chan))
        (swap! *state assoc-in [:plc-state :running] false)
        (swap! *state assoc :control-chan nil)))))

(defn update-scan-time [value]
  (swap! *state assoc-in [:plc-state :scan-time] value))

(defn update-input [address value]
  (swap! *state update :plc-state plc/set-input address value))

(defn update-output [address value]
  (swap! *state update :plc-state plc/set-output address value))

;; Editor event handlers
(defn editor-add-rung [_]
  (println "Adding new rung to program...")
  (let [new-rung {:name "New Rung"
                  :elements [(ladder/normally-open :input 0)
                             (ladder/output :output 0)]}]
    (swap! *state update-in [:program :rungs] conj new-rung)))

;; Initialize the state with test inputs
(defn init-inputs []
  (println "Initializing inputs in events namespace")
  (swap! *state update :plc-state plc/set-input 0 true)
  (swap! *state update :plc-state plc/set-input 1 false)
  (swap! *state update :plc-state plc/set-input 2 false)
  (swap! *state update :plc-state plc/set-input 3 false)
  ;; Force synchronization of state
  (swap! *state update :plc-state identity))

;; Run initialization
(init-inputs)