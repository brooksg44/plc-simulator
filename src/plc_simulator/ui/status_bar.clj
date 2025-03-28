(ns plc-simulator.ui.status-bar
  (:require [cljfx.api :as fx]
            [java-time.api :as jt]))

;; Status bar component
(defn status-bar-view [{:keys [state]}]
  {:fx/type :h-box
   :spacing 10
   :padding 5
   :style {:-fx-background-color "#f0f0f0"
           :-fx-border-color "#cccccc"
           :-fx-border-width "1 0 0 0"}
   :children [{:fx/type :label
               :text (str "Status: " (if (:running state) "Running" "Stopped"))}
              {:fx/type :region
               :h-box/hgrow :always}
              {:fx/type :label
               :text (str "Scan Time: " (:scan-time state) "ms")}
              {:fx/type :label
               :text (str "Time: " (jt/format "HH:mm:ss" (jt/local-time)))}]})