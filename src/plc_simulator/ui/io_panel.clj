(ns plc-simulator.ui.io-panel
  (:require [cljfx.api :as fx]
            [plc-simulator.model.plc-state :as plc]
            [plc-simulator.ui.events :as events]))

;; Helper function to render a toggle button for an IO point
(defn io-toggle [{:keys [address value label is-input?]}]
  (let [update-fn (if is-input? events/update-input events/update-output)]
    {:fx/type :h-box
     :spacing 10
     :alignment :center-left
     :children [{:fx/type :label
                 :min-width 100
                 :text label}
                {:fx/type :toggle-button
                 :selected value
                 :on-action (fn [_]
                              (update-fn address (not value)))}]}))

;; Function to create a grid of IO points
(defn io-grid [{:keys [io-map title is-input?]}]
  (let [sorted-io (sort-by key io-map)
        columns 4  ;; Number of columns in the grid
        rows (int (Math/ceil (/ (count sorted-io) columns)))]
    {:fx/type :v-box
     :spacing 10
     :children 
     [{:fx/type :label
       :style {:-fx-font-weight :bold}
       :text title}
      {:fx/type :grid-pane
       :hgap 20
       :vgap 10
       :children (vec (for [[[address value] idx] (map vector sorted-io (range))
                            :let [row (int (/ idx columns))
                                  col (mod idx columns)]]
                        {:fx/type :h-box
                         :grid-pane/row row
                         :grid-pane/column col
                         :children [{:fx/type io-toggle
                                     :address address
                                     :value value
                                     :is-input? is-input?
                                     :label (str address)}]}))}]}))

;; Create a "New IO Point" section
(defn new-io-point [{:keys [io-type]}]
  (let [is-input? (= io-type :input)
        update-fn (if is-input? events/update-input events/update-output)]
    {:fx/type :h-box
     :spacing 10
     :alignment :center-left
     :children [{:fx/type :label
                 :text "New Address:"}
                {:fx/type :text-field
                 :pref-width 100
                 :prompt-text "Enter address"
                 :id (str "new-" (name io-type) "-address")}
                {:fx/type :button
                 :text "Add"
                 :on-action (fn [event]
                              (let [scene (.getScene (.getTarget event))
                                    address-text (.getText (.lookup scene (str "#new-" (name io-type) "-address")))]
                                (try
                                  (let [address (Integer/parseInt address-text)]
                                    (update-fn address false))
                                  (catch NumberFormatException _
                                    ;; Invalid input - do nothing
                                    nil))))}]}))

;; Main IO panel view
(defn io-panel-view [{:keys [state]}]
  {:fx/type :scroll-pane
   :fit-to-width true
   :content 
   {:fx/type :v-box
    :spacing 20
    :padding 10
    :children 
    [{:fx/type io-grid
      :io-map (:inputs state)
      :title "Inputs"
      :is-input? true}
     {:fx/type new-io-point
      :io-type :input}
     {:fx/type :separator}
     {:fx/type io-grid
      :io-map (:outputs state)
      :title "Outputs"
      :is-input? false}
     {:fx/type new-io-point
      :io-type :output}
     {:fx/type :separator}
     {:fx/type :v-box
      :spacing 10
      :children 
      [{:fx/type :label
        :style {:-fx-font-weight :bold}
        :text "Timers"}
       {:fx/type :grid-pane
        :hgap 20
        :vgap 10
        :children (vec (for [[idx [address timer]] (map-indexed vector (:timers state))
                              :let [row (int (/ idx 2))
                                    col (mod idx 2)]]
                          {:fx/type :h-box
                           :grid-pane/row row
                           :grid-pane/column col
                           :spacing 10
                           :children [{:fx/type :label
                                       :min-width 60
                                       :text (str "T" address ":")}
                                      {:fx/type :progress-bar
                                       :min-width 150
                                       :progress (if (and timer (pos? (:timer-preset timer)))
                                                  (/ (:timer-value timer) (:timer-preset timer))
                                                  0.0)}
                                      {:fx/type :label
                                       :text (if timer
                                               (str (:timer-value timer) "/" (:timer-preset timer))
                                               "N/A")}]}))}]}
     {:fx/type :separator}
     {:fx/type :v-box
      :spacing 10
      :children 
      [{:fx/type :label
        :style {:-fx-font-weight :bold}
        :text "Counters"}
       {:fx/type :grid-pane
        :hgap 20
        :vgap 10
        :children (vec (for [[idx [address counter]] (map-indexed vector (:counters state))
                              :let [row (int (/ idx 2))
                                    col (mod idx 2)]]
                          {:fx/type :h-box
                           :grid-pane/row row
                           :grid-pane/column col
                           :spacing 10
                           :children [{:fx/type :label
                                       :min-width 60
                                       :text (str "C" address ":")}
                                      {:fx/type :progress-bar
                                       :min-width 150
                                       :progress (if (and counter (pos? (:counter-preset counter)))
                                                  (/ (:counter-value counter) (:counter-preset counter))
                                                  0.0)}
                                      {:fx/type :label
                                       :text (if counter
                                               (str (:counter-value counter) "/" (:counter-preset counter))
                                               "N/A")}]}))}]}]}})