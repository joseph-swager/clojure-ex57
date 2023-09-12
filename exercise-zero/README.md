# exercise-zero

## Requirements

### Exercise Zero Pseudocode
Here’s how our tip calculator might look in pseudocode:
```
TipCalculator
	Initialize billAmount to 0
	Initialize tip to 0
	Initialize tipRate to 0
	Initialize total to 0
	Prompt for billAmount with "What is the bill amount?"
	Prompt for tipRate with "What is the tip rate?"
	Convert billAmount to a number
	Convert tipRate to a number
	tip = billAmount * (tipRate / 100)
	Round tip up to nearest cent
	total = billAmount + tip
	Display "Tip: $" + tip
	Display "Total: $" + total
End
```


### Constraints (Not Implemented)
- Enter the tip as a percentage. For example, a 15% tip would be entered as 15, not 0.15. Your program should handle the division.
- Round fractions of a cent up to the next cent.

**Note:** Constraints (Not Implemented)

**Note:** Only the first challenge has been implemented 

### Challenge 1
- Ensure that the user can enter only numbers for the bill amount and the tip rate. If the user enters non-numeric values, display an appropriate message and exit the program. 

**Example:**
```
Input:
bill amount: abcd
tip rate: 15
Expected result: Please enter a valid number for the bill amount.
```

### Challenge 2
- Instead of displaying an error message and exiting the program, keep asking the user for correct input until it is provided.

### Challenge 3
- Don’t allow the user to enter a negative number.

### Challenge 4
- Break the program into functions that do the computations.

### Challenge 5
- Implement this program as a GUI program that automatically updates the values when any value changes.

### Challenge 6
- Instead of the user entering the value of the tip as a percentage, have the user drag a slider that rates satisfaction with the server, using a range between 5% and 20%.



## Usage

Run as an clojure CLI :
```bash
cd exercise-zero
clojure -X:run
```

Run all test of all projects from root of the project:
```bash
lien sub test
```

Run as an leiningen run or test in on the project :
```bash
cd exercise-zero
lein run
lien test
```

## License

Copyright © 2023 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
