(ns exercise-twentynine.core 
  (:require
   [clojure.string :as string]))

(def ask-rate-question "What is the rate of return?")

(defn calculate-years-to-double [rate-of-return]
    (int (/ 72 rate-of-return)))

(defn validate-input [input]
  (let [trimmed-input (-> input
                           (string/trim)
                           (string/replace #"\s" ""))
        parsed-value (try
                        (Double. trimmed-input)
                        (catch Exception _ nil))]
      (cond
        (nil? parsed-value)
          {:value input :valid false :reason "Sorry. That's not a valid input because it's not a number."}
        
        (<= parsed-value 0)
          {:value parsed-value :valid false :reason "Sorry. That's not a valid input because zero or negative values aren't valid rates of return."}
        
        :else
          {:value parsed-value :valid true :reason nil})))

(defn prompt-for-input []
  (loop []
    (println ask-rate-question)
    (let [input (string/trim (read-line)) validation-result (validate-input input)]
        (if (:valid validation-result)
          (:value validation-result)
          (do
            (println (:reason validation-result))
            (recur))))))


(defn- execute [& _args]
  (let [rate-input (prompt-for-input) years (calculate-years-to-double rate-input)]
      (println (str "It will take " years " years to double your initial investment."))))

(defn -main [& _args]
  (execute))

