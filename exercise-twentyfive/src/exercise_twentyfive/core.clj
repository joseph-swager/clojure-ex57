(ns exercise-twentyfive.core)

(defn- re-contains? [re s]
  (boolean (re-find re s)))
        
(defn not-blank? [s] 
  (-> s clojure.string/blank? not))

(defn contains-uppercase? [s] 
  (re-contains? #"[A-Z]" s))

(defn contains-lowercase? [s]
  (re-contains? #"[a-z]" s))

(defn contains-alphabet? [s] 
  (or (contains-lowercase? s) (contains-uppercase? s)))

(defn contains-number? [s] 
  (re-contains? #"\d+" s))

(defn at-least-eight? [s] 
  (>= (count s) 8))

(defn contains-special? [s] 
  (re-contains? #"[^\w\d\s]" s))

(defn is-strong?
  "return boolean if password string is at least 8 chars and contains both numbers and any alphabet characters"
  [s] (and (at-least-eight? s) (contains-number? s) (contains-alphabet? s)))

(defn is-very-strong?
  "return boolean if password string is at least 8 chars and contains numbers, both lowwer and uppercase alphabet characters and contains special characters"
  [s] (and (at-least-eight? s) (contains-lowercase? s) (contains-uppercase? s) (contains-number? s) (contains-special? s)))

(defn validate-password
  "validates the strength of a password"
  [s] (cond
        (is-very-strong? s) :very-strong
        (is-strong? s) :strong
        (contains-alphabet? s) :weak
        :else :very-weak))
