(defproject clojure-ex57 "0.1.0-SNAPSHOT"
  :description "Parent project for multiple Clojure mini-projects that follow the 57 exercises for programmers from pragprog."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :plugins [[lein-sub "0.3.0"]]
  :sub ["exercise-one/" "exercise-two/" "exercise-three/" "exercise-twentyfive/"]
  :repl-options {:init-ns clojure-exercise.core})
