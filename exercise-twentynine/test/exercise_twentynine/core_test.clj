(ns exercise-twentynine.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [exercise-twentynine.core :refer [calculate-years-to-double validate-input]]))

(deftest test-positive-inputs
  (testing "Positive rate of return values"
    (is (= 18 (calculate-years-to-double 4)))
    (is (= 1 (calculate-years-to-double 72)))
    (is (= 36 (calculate-years-to-double 2)))))

(deftest test-valid-input-strings
      (testing "Valid Positive rate of return values"
        (is (= {:value 22.0, :valid true, :reason nil} (validate-input "22")))
        (is (= {:value 22.0, :valid true, :reason nil} (validate-input "22   \t\n")))
        (is (= {:value 1.0E-6, :valid true, :reason nil} (validate-input ".000001")))))

(deftest test-invalid-input-strings-not-numbers
      (testing "Invalid Non-numeric rate was inputed"
        (is (= {:value "ABC", :valid false, :reason "Sorry. That's not a valid input because it's not a number."} (validate-input "ABC")))
        (is (= {:value "1a", :valid false, :reason "Sorry. That's not a valid input because it's not a number."} (validate-input "1a")))
        (is (= {:value "1--1", :valid false, :reason "Sorry. That's not a valid input because it's not a number."} (validate-input "1--1")))))

(deftest test-invalid-input-strings-zero-or-numbers
      (testing "Invalid numeric rate was zero or negative"
        (is (= {:value -1.2, :valid false, :reason "Sorry. That's not a valid input because zero or negative values aren't valid rates of return."} (validate-input "-1.2")))
        (is (= {:value 0.0, :valid false, :reason "Sorry. That's not a valid input because zero or negative values aren't valid rates of return."} (validate-input "0")))
        (is (= {:value -1.0, :valid false, :reason "Sorry. That's not a valid input because zero or negative values aren't valid rates of return."} (validate-input "   -1")))))