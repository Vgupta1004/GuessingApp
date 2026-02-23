# GuessingApp
## Use Case 4: Error Handling and Validation

**Description:**
- Handle non-numeric input
- Prevent out-of-range guesses
- Display user-friendly error messages
- Prevent application crash
- Log invalid attempts

**Classes Involved:**
- `InvalidInputException.java` - Custom exception used when user input fails validation
- `ValidationService.java` - Handles Validation of user input before it is used in game logic
- `GuessingApp.java` - Coordinates the game execution while ensuring all user inputs are safely validated before processing

**Key Concepts:**
- Exception Handling(try-catch)
- Custom Exceptions
- Fail-fast approach
   
