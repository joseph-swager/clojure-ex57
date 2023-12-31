(ns exercise-twentyfive.core-test
  (:require [clojure.test :refer :all]
            [exercise-twentyfive.core :refer :all]))

(deftest test-contains-uppercase?
  (are [x y] (= x y)
             true (contains-uppercase? "A")
             false (contains-uppercase? "a")
             false (contains-uppercase? "0")
             false (contains-uppercase? "!")
             false (contains-uppercase? "")
             )
  )

(deftest test-contains-lowercase?
  (are [x y] (= x y)
             false (contains-lowercase? "A")
             true (contains-lowercase? "a")
             false (contains-lowercase? "0")
             false (contains-lowercase? "!")
             false (contains-lowercase? "")
             )
  )

(deftest test-contains-alphabet?
  (are [x y] (= x y)
             true (contains-alphabet? "A")
             true (contains-alphabet? "a")
             false (contains-alphabet? "0")
             false (contains-alphabet? "!")
             false (contains-alphabet? "")
             true (contains-alphabet? "Password1234")
             )
  )

(deftest test-contains-number?
  (are [x y] (= x y)
             false (contains-number? "A")
             false (contains-number? "a")
             true (contains-number? "0")
             false (contains-number? "!")
             false (contains-number? "")
             true (contains-number? "password1234")
             )
  )

(deftest test-at-least-eight?
  (are [x y] (= x y)
             true (at-least-eight? "12345678")
             false (at-least-eight? "t")
             true (at-least-eight? "hello_world")
             false (at-least-eight? "hello")
             )

  )

(deftest test-contains-special?
  (are [x y] (= x y)
             false (contains-special? "A")
             false (contains-special? "a")
             false (contains-special? "0")
             true (contains-special? "!")
             false (contains-special? "")
             true (contains-special? "COOL-")
             true (contains-special? "$money")
             )
  )

(deftest test-is-strong?
  (are [x y] (= x y)
             false (is-strong? "A")
             false (is-strong? "1234567890")
             false (is-strong? "0A!")
             false (is-strong? "!")
             false (is-strong? "")
             true (is-strong? "Password1234")
             true (is-strong? "1a2s3f5g6jk!")
             false (is-strong? "123456789!")
             )
  )

(deftest test-is-very-strong?
  (are [x y] (= x y)
             false (is-very-strong? "A")
             false (is-very-strong? "1234567890")
             false (is-very-strong? "0A!")
             false (is-very-strong? "!")
             false (is-very-strong? "")
             false (is-very-strong? "Password1234")
             true (is-very-strong? "1a2s3f5G6jk!")
             false (is-very-strong? "1234H!")
             )
  )

(deftest test-validate-password
  (are [x y] (= x y)
             :weak (validate-password "A")
             :very-weak (validate-password "1234567890")
             :weak (validate-password "0A!")
             :very-weak (validate-password "!")
             :very-weak (validate-password "")
             :strong (validate-password "Password1234")
             :very-strong (validate-password "1a2s3f5G6jk!")
             :weak (validate-password "1234H!")
             )
  )