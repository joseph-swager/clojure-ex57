(ns exercise-thirty-five-gui-front.init
    (:require [exercise-thirty-five-gui-front.core :as core]
              [exercise-thirty-five-gui-front.conf :as conf]))

(enable-console-print!)

(defn start-descjop! []
  (core/init! conf/setting))

(start-descjop!)
