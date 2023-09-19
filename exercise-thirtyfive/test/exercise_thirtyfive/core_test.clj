(ns exercise-thirtyfive.core-test
  (:require [clojure.test :refer :all]
            [exercise-thirtyfive.core :refer :all]))

(deftest test-pick-winner
  (is (contains? #{"Homer" "Bart" "Maggie" "Lisa" "Moe"} (pick-winner ["Homer" "Bart" "Maggie" "Lisa" "Moe"])))
  (is (contains? #{"Alice"} (pick-winner ["Alice"])))
  (is (empty? (pick-winner []))))