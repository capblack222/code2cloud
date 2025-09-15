# 🧮 Mini Project: Calculator CLI in Java

## Problem Statement

Build a Command-Line Interface (CLI) Calculator in Java that performs basic and advanced arithmetic operations. The calculator should accept user input from the terminal, process it, and display the result in a clean format.

## Requirements

### Basic Operations

- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/) with handling for division by zero

### Advanced Operations (optional stretch goal)

- Modulus (%)
- Power (^)
- Square root (√)

### User Interaction

- Display a menu of operations when the program starts
- Allow the user to select an operation and input numbers
- Print the result of the operation
- Ask if the user wants to perform another calculation or exit

### Error Handling

- Handle invalid input (e.g., non-numeric values, invalid operators) gracefully
- Display friendly error messages without crashing

### Code Structure

- Use a Calculator class with methods for each operation
- Keep the main method clean by delegating work to helper methods

### Optional Enhancements

- Add support for continuous calculations (use the last result as input for the next operation)
- Add command history (store previous results in a list and print on request)
- Add unit tests for calculator methods
