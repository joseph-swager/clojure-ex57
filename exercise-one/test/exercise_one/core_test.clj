(ns exercise-one.core-test
  (:require [clojure.test :refer :all]
            [exercise-one.core :refer :all]))

(deftest calculate-tip-test
  (testing "Tip calculation"
    (is (= {:tip 6.0, :total 46.0} (calculate-tip-and-total 40.0 15)))
    (is (= {:tip 0.0, :total 0.0} (calculate-tip-and-total 0 15)))
    (is (= {:tip 4.5, :total 34.5} (calculate-tip-and-total 30 15)))))

(deftest parse-number-test
  (testing "Parsing numbers"
    (is (= 42.0 (parse-number "42")))
    (is (= 42.5 (parse-number "42.5")))
    (is (= :invalid (parse-number "abcd")))))

;; ... Further tests for other functions ...

