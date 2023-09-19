(ns exercise-thirtyfive.core
  (:require [clojure.string :as str]))

(defn get-contestants []
  (loop [contestants []]
    (println "Enter a name (leave blank to finish): ")
    (let [name (str/trim (read-line))]
      (if (empty? name)
        contestants
        (recur (conj contestants name))))))

(defn pick-winner [contestants]
  (if (empty? contestants)
    nil
    (let [winner-index (rand-int (count contestants))]
      (get contestants winner-index))))

(defn- execute [& _args]
  (let [contestants (get-contestants)
        winner (pick-winner contestants)]
    (if (empty? winner)
      (println "No contestants entered.")
      (println (str "The winner is... " winner)))))

(defn -main [& _args]
  (execute))