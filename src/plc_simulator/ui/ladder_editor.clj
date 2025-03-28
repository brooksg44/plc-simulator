(ns plc-simulator.ui.ladder-editor
  (:require [cljfx.api :as fx]
            [plc-simulator.model.ladder-logic :as ladder]
            [clojure.string :as str]))

;; Helper function to render a ladder element
(defn ladder-element-view [{:keys [element index]}]
  (let [element-type (:element-type element)
        address-info (:address-info element)
        address-type (:address-type address-info)
        address (:address address-info)
        type-marker (case element-type
                      :normally-open "[ ]"
                      :normally-closed "[/]"
                      :output "( )"
                      :timer "[T]"
                      :counter "[C]"
                      "???")
        address-marker (case address-type
                         :input (str "I" address)
                         :output (str "Q" address)
                         :memory (str "M" address)
                         :timer (str "T" address)
                         :counter (str "C" address)
                         "???")
        display-text (if (#{:timer :counter} element-type)
                       (str type-marker address-marker 
                            " (" (:preset element) ")")
                       (str type-marker address-marker))]
    {:fx/type :label
     :style {:-fx-border-color :black
             :-fx-border-width 1
             :-fx-padding 5}
     :text display-text}))

;; Function to render a single rung
(defn rung-view [{:keys [rung index]}]
  {:fx/type :v-box
   :spacing 5
   :children 
   [{:fx/type :h-box
     :spacing 5
     :children [{:fx/type :label
                 :style {:-fx-font-weight :bold}
                 :text (str "Rung " (inc index) ": " (:name rung))}]}
    {:fx/type :h-box
     :spacing 5
     :children (vec (cons 
                     {:fx/type :label
                      :text "|"}
                     (into
                      (mapv (fn [element idx]
                              {:fx/type ladder-element-view
                               :element element
                               :index idx})
                            (:elements rung)
                            (range))
                      [{:fx/type :label
                        :text "|"}])))}]})

;; Main ladder editor view
(defn ladder-editor-view [{:keys [program]}]
  (let [rungs (:rungs program)]
    {:fx/type :scroll-pane
     :fit-to-width true
     :content
     {:fx/type :v-box
      :spacing 20
      :padding 10
      :children
      (into [{:fx/type :h-box
              :spacing 10
              :alignment :center-left
              :children [{:fx/type :label
                          :style {:-fx-font-weight :bold}
                          :text (str "Program: " (:name program))}
                         {:fx/type :button
                          :text "Add Rung"
                          :on-action {:event/type :editor-add-rung}}]}]
            (mapv (fn [rung idx]
                    {:fx/type rung-view
                     :rung rung
                     :index idx})
                  rungs
                  (range)))}}))

;; Function to create an element picker dialog
(defn element-picker-dialog []
  {:fx/type :dialog
   :showing true
   :title "Add Element"
   :content
   {:fx/type :v-box
    :spacing 10
    :padding 10
    :children
    [{:fx/type :h-box
      :spacing 10
      :children [{:fx/type :label
                  :text "Element Type:"}
                 {:fx/type :choice-box
                  :id "element-type"
                  :items ["Normally Open", "Normally Closed", "Output", "Timer", "Counter"]}]}
     {:fx/type :h-box
      :spacing 10
      :children [{:fx/type :label
                  :text "Address Type:"}
                 {:fx/type :choice-box
                  :id "address-type"
                  :items ["Input", "Output", "Memory", "Timer", "Counter"]}]}
     {:fx/type :h-box
      :spacing 10
      :children [{:fx/type :label
                  :text "Address:"}
                 {:fx/type :text-field
                  :id "element-address"
                  :pref-width 100}]}
     {:fx/type :h-box
      :spacing 10
      :children [{:fx/type :label
                  :text "Preset:"}
                 {:fx/type :text-field
                  :id "element-preset"
                  :pref-width 100
                  :disable true}]} ;; Only enabled for timers and counters
     ]}
   :dialog-pane
   {:button-types [:ok :cancel]}})