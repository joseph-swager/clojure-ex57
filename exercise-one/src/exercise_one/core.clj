(ns exercise-one.core)

(defn parse-number [s]
  (try
    (Double/parseDouble s)
    (catch NumberFormatException _
      :invalid)))

(defn get-input [prompt]
  (println prompt)
  (read-line))

(defn calculate-tip-and-total [bill-amount tip-rate]
  (let [tip (double (* bill-amount (/ tip-rate 100)))
        total (+ bill-amount tip)]
    {:tip tip, :total total}))

(defn display-results [{:keys [tip total]}]
  (println "Tip: $" tip)
  (println "Total: $" total))

(defn execute [& _args]
  (let [bill-input (get-input "What is the bill amount?")
        tip-rate-input (get-input "What is the tip rate?")
        bill-amount (parse-number bill-input)
        tip-rate (parse-number tip-rate-input)]

    (when (or (= :invalid bill-amount) (= :invalid tip-rate))
      (println "Please enter a valid number.")
      (System/exit 1))

    (->> (calculate-tip-and-total bill-amount tip-rate)
         (display-results))))

(defn -main [& _args]
  (execute))


;; exercise one sudo code
; Here’s how our tip calculator might look in pseudocode:
; TipCalculator
;     Initialize billAmount to 0
;     Initialize tip to 0
;     Initialize tipRate to 0
;     Initialize total to 0
;     Prompt for billAmount with "What is the bill amount?"
;     Prompt for tipRate with "What is the tip rate?"
;     convert billAmount to a number
;     convert tipRate to a number
;     tip = billAmount * (tipRate / 100)
;     round tip up to nearest cent
;     total = billAmount + tip
;     Display "Tip: $" + tip
;     Display "Total: $" + total
; End

;; constraints not implemented
; Constraints
;   • Enter the tip as a percentage. For example, a 15% tip
;   would be entered as 15, not 0.15. Your program should
;   handle the division.
;   • Round fractions of a cent up to the next cent.

;; Only the first challenge has been implemeted 

;; Challenge 1
; • Ensure that the user can enter only numbers for the bill
; amount and the tip rate. If the user enters non-numeric
; values, display an appropriate message and exit the
; program. Here’s a test plan as an example:
; Input:
; bill amount: abcd
; tip rate: 15
; Expected result: Please enter a valid number for
; the bill amount.

;; Challenge 2
; • Instead of displaying an error message and exiting the
; program, keep asking the user for correct input until it
; is provided.

;; Challenge 3
; • Don’t allow the user to enter a negative number.

;; Challenge 4
; • Break the program into functions that do the computa-
; tions.

;; Challenge 5
; • Implement this program as a GUI program that automat-
; ically updates the values when any value changes.

;; Challenge 6
; • Instead of the user entering the value of the tip as a
; percentage, have the user drag a slider that rates satis-
; faction with the server, using a range between 5% and
; 20%.