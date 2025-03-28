(ns plc-simulator.ui.ladder-editor
  (:require [cljfx.api :as fx]
            [plc-simulator.model.ladder-logic :as ladder]
            [plc-simulator.model.plc-state :as plc]
            [clojure.string :as str]))

;; Helper function to render a ladder element with color based on status
(defn ladder-element-view [{:keys [element index state]}]
  (let [element-type (:element-type element)
        address-info (:address-info element)
        address-type (:address-type address-info)
        address (:address address-info)

        ;; SIMPLE DIRECT ACCESS for output 0 state
        output-0-active (and (map? (:outputs state))
                             (contains? (:outputs state) 0)
                             (true? (get-in state [:outputs 0])))
        
        ;; Direct color for specific outputs - always use this approach
        element-color (cond
                        ;; OUTPUT 0 IS SPECIAL CASE - Always check directly 
                        (and (= element-type :output) 
                             (= address-type :output)
                             (= address 0)
                             output-0-active)
                        "#008000" ;; GREEN for output 0 when active
                        
                        ;; Other output elements
                        (and (= element-type :output)
                             (= address-type :output))
                        (if (and (map? (:outputs state))
                                (contains? (:outputs state) address)
                                (true? (get-in state [:outputs address])))
                          "#008000" ;; GREEN for active outputs
                          "#000000") ;; BLACK for inactive
                          
                        ;; Normally open inputs
                        (and (= element-type :normally-open)
                             (= address-type :input))
                        (if (get-in state [:inputs address] false)
                          "#008000" ;; GREEN for active inputs  
                          "#000000") ;; BLACK for inactive
                          
                        ;; Normally closed elements - invert colors
                        (= element-type :normally-closed)
                        (if (not (plc/get-input state address))
                          "#008000" ;; GREEN when the input is FALSE
                          "#000000") ;; BLACK when input is TRUE
                          
                        ;; Default color is black
                        :else "#000000")
        
        ;; Basic element formatting
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
    
    ;; Debug print for outputs to help troubleshoot
    (when (= element-type :output)
      (println "LADDER OUTPUT ELEMENT - Address:" address 
               "Type:" address-type
               "Output Map:" (pr-str (:outputs state))
               "Is Active:" (if (= element-color "#008000") "YES" "NO")))
    
    {:fx/type :label
     :style {:-fx-border-color :black
             :-fx-border-width 1
             :-fx-padding 5
             :-fx-text-fill element-color} ;; Apply text color based on status
     :text display-text}))

;; Function to render a single rung
(defn rung-view [{:keys [rung index state]}]
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
                               :index idx
                               :state state}) ;; Pass state to each element
                            (:elements rung)
                            (range))
                      [{:fx/type :label
                        :text "|"}])))}]})

;; Main ladder editor view
(defn ladder-editor-view [{:keys [program state]}] ;; Add state parameter
  (let [rungs (:rungs program)]
    ;; Debug print state
    (println "LADDER EDITOR STATE - Outputs:" (pr-str (:outputs state)))
    
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
                         {:fx/type :label
                          :style {:-fx-font-weight :bold}
                          :text (str "Outputs: " (pr-str (:outputs state)))}
                         {:fx/type :button
                          :text "Add Rung"
                          :on-action {:event/type :editor-add-rung}}]}]
            (mapv (fn [rung idx]
                    {:fx/type rung-view
                     :rung rung
                     :index idx
                     :state state}) ;; Pass state to each rung
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