(ns exercise-thirty-five-gui-front.init
  (:require [figwheel.client :as fw :include-macros true]
            [exercise-thirty-five-gui-front.core :as core]
            [exercise-thirty-five-gui-front.conf :as conf]))

(enable-console-print!)

(fw/watch-and-reload
 :websocket-url   "ws://localhost:3449/figwheel-ws"
 :jsload-callback 'start-descjop!)

(defn start-descjop! []
  (core/init! conf/setting))

(start-descjop!)
