# GuessingApp
A Java console application built using multiple Use Cases that demonstrate core programming concepts such as encapsulation, input handling, exception management, persistence, and application lifecycle control.

## Use Case 1: Game Initialization
Initializes the game by generating a random target number, setting attempts/hints, loading game configuration, and displaying rules. Uses constructor initialization, encapsulation, and random number generation.

## Use Case 2: User Guess Submission
Handles user input, validates guesses, and compares them with the target number. Uses input validation, method calls, and attempt tracking.

## Use Case 3: Hint Generation
Provides controlled hints after incorrect guesses while limiting hint count. Implements method abstraction, encapsulated hint logic, and basic arithmetic/modulus operations.

## Use Case 4: Error Handling & Validation
Prevents crashes by handling invalid input, out‑of‑range numbers, and logging errors. Uses try–catch, custom exceptions, and a fail‑fast approach.

## Use Case 5: Game Result Storage
Saves player results to a file or database and retrieves previous records. Uses File I/O (BufferedWriter/BufferedReader) and object persistence.

## Use Case 6: Game Restart & Exit
Allows players to restart or exit gracefully, resetting variables and closing resources cleanly. Uses application lifecycle handling and resource cleanup.
