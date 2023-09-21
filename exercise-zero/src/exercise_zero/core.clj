(ns exercise-zero.core)

(defn parse-number [s]
  (try
    (Double/parseDouble s)
    (catch NumberFormatException _
      :invalid)))

(defn get-input [prompt]
  (println prompt)
  (read-line))

(defn calculate-total-with-tip [bill-amount tip-rate]
  (let [tip (double (* bill-amount (/ tip-rate 100)))
        total (+ bill-amount tip)]
    {:tip tip, :total total}))

(defn display-results [{:keys [tip total]}]
  (println "Tip: $" tip)
  (println "Total: $" total))

(defn execute [& _args]
  (let [bill-input (get-input "What is the bill amount?")
        tip-rate-input (get-input "What is the tip rate?")
        bill-amount (parse-number bill-input)
        tip-rate (parse-number tip-rate-input)]

    (when (or (= :invalid bill-amount) (= :invalid tip-rate))
      (println "Please enter a valid number.")
      (System/exit 1))

    (->> (calculate-total-with-tip bill-amount tip-rate)
         (display-results))))

(defn -main [& _args]
  (execute))