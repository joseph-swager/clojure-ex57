(ns exercise-thirtyfive-gui.core
  (:require
    [cljfx.api :as fx]
    [cljfx.controls :refer [label button text-field vbox]])
  (:gen-class))

(defn pick-winner [contestants]
  (if (empty? contestants)
    nil
    (let [winner-index (rand-int (count contestants))]
      (get contestants winner-index))))



(defn create-label [text]
  (label text))

(defn create-winner-label []
  (label "The winner is..."))

(defn create-name-field []
  (text-field))

(defn create-add-button [contestants name-field]
  (button "Add Name"
    (fn [_]
      (let [name (fx/text name-field)]
        (if (seq name)
          (swap! contestants conj name)
          (fx/alert "Name cannot be blank"))))))

(defn create-pick-button [contestants winner-label]
  (button "Pick Winner"
    (fn [_]
      (let [winner (pick-winner @contestants)]
        (fx/text! winner-label (str "The winner is... " winner))))))

(defn create-gui []
  (let [contestants (atom [])
        winner-label (create-winner-label)
        name-field (create-name-field)
        add-button (create-add-button contestants name-field)
        pick-button (create-pick-button contestants winner-label)]
    (fx/start!
      (fx/stage
        (fx/scene
          (vbox
            (create-label "Enter a name:")
            name-field
            add-button
            pick-button
            winner-label))))))

(defn execute [& _args]
  (create-gui))


(defn -main [& _args]
  (execute))
