# exercise-twenty-nine
## Handling Bad Input
### Requirements 
Write a quick calculator that prompts for the rate of return
on an investment and calculates how many years it will take
to double your investment.
The formula is
``` years = 72 / r ```
where r is the stated rate of return.

#### Example Output
```
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.
```

### Constraints
- Don’t allow the user to enter 0.
- Don’t allow non-numeric values.
- Use a loop to trap bad input, so you can ensure that the user enters valid values.

### Challenge
- Display a different error message when the user enters 0.

## Usage

FIXME

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
