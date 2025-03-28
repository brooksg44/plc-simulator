(ns plc-simulator.ui.main-view
  (:require [cljfx.api :as fx]
            [plc-simulator.ui.io-panel :as io-panel]
            [plc-simulator.ui.ladder-editor :as ladder-editor]
            [plc-simulator.ui.status-bar :as status-bar]
            [plc-simulator.ui.events :as events]
            [plc-simulator.engine.executor :as executor])
  (:import [javafx.application Platform]
           [javafx.event ActionEvent]
           [javafx.scene.control Button]))

;; Function to clean up and exit application
(defn shutdown-app []
  (println "Shutting down PLC Simulator...")
  (when-let [control-chan (get @events/*state :control-chan)]
    (println "Stopping PLC execution...")
    (executor/stop-plc-execution control-chan))
  (Platform/exit)
  (System/exit 0))

;; Root view with direct JavaFX event handlers
(defn root-view [{:keys [plc-state program]}]
  {:fx/type :stage
   :showing true
   :title "PLC Simulator"
   :width 800
   :height 600
   :on-close-request (fn [_] (shutdown-app))
   :scene {:fx/type :scene
           :root {:fx/type :v-box
                  :padding 10
                  :spacing 10
                  :children [{:fx/type :h-box
                              :spacing 10
                              :alignment :center-left
                              :children [{:fx/type :button
                                          :text (if (:running plc-state) "Stop" "Start")
                                          :on-action (fn [^ActionEvent event]
                                                       (println "Button clicked!")
                                                       (events/toggle-running event))}
                                         {:fx/type :label
                                          :text (str "Scan Time: " (:scan-time plc-state) "ms")}
                                         {:fx/type :slider
                                          :min 10
                                          :max 1000
                                          :value (:scan-time plc-state)
                                          :show-tick-marks true
                                          :show-tick-labels true
                                          :major-tick-unit 100
                                          :minor-tick-count 1
                                          :block-increment 50
                                          :on-value-changed (fn [value]
                                                              (events/update-scan-time value))}]}
                             
                             {:fx/type :tab-pane
                              :pref-height 500
                              :tabs [{:fx/type :tab
                                      :text "I/O Monitor"
                                      :closable false
                                      :content {:fx/type io-panel/io-panel-view
                                                :state plc-state}}
                                     {:fx/type :tab
                                      :text "Ladder Editor"
                                      :closable false
                                      :content {:fx/type ladder-editor/ladder-editor-view
                                                :program program}}]}
                             
                             {:fx/type status-bar/status-bar-view
                              :state plc-state}]}}})

;; Event handler function
(defn event-handler [event]
  (let [event-type (:event/type event)]
    (println "Handling event:" event-type)
    (case event-type
      :editor-add-rung (events/editor-add-rung event)
      (println "Unhandled event:" event))))

;; App creation with subscription to state changes
(def renderer
  (fx/create-renderer
    :middleware (fx/wrap-map-desc
                  (fn [state]
                    (root-view state)))
    :opts {:fx.opt/map-event-handler event-handler}))

;; Function to start the UI
(defn start-ui []
  (fx/mount-renderer events/*state renderer)
  {:state events/*state
   :renderer renderer})