package Week_1.project_1;
import java.util.*;

public class Calc {
    int firstNumber, secondNumber, res;
    Calc(int a, int b){
        firstNumber = a;
        secondNumber = b;
    }
    Calc(int a){
        firstNumber = a;
    }
    void printRes(){
        System.out.println("Result is: " + res);
    }
    int add(){
        res = firstNumber + secondNumber;
        printRes();
        return res;
    }
    int sub(){
        res = firstNumber - secondNumber;
        printRes();
        return res;
    }
    int mul(){
        res = firstNumber * secondNumber;
        printRes();
        return res;
    }
    int div(){ 
        if (secondNumber == 0) {
            System.out.println("\nError: Division by zero is not allowed!\n");
            return -1;
        }
        res = firstNumber / secondNumber;
        printRes();
        return res;
    }
    int square(){
        res = firstNumber * firstNumber;
        printRes();
        return res;
    }
    int cube(){
        res = firstNumber * firstNumber * firstNumber;
        printRes();
        return res;
    }
    int mod(){
        res = firstNumber % secondNumber;
        printRes();
        return res;
    }
    int pow(){
        res = (int) Math.pow(firstNumber, secondNumber);
        printRes();
        return res;
    }
    int sqrt(){
        if (firstNumber < 0) {
            System.out.println("\nError: Square root of negative number is not defined in real numbers!\n");
            return -1;
        }
        res = (int) Math.sqrt(firstNumber);
        printRes();
        return res;
    }

    public static void main(String[] args) {
        System.out.println("\n\nHello, There! \nWelcome to the Calculator Program");
        Scanner sc = new Scanner(System.in);
        int input1, input2, result, operationChoice, continueChoice = 0;
        do {
            // Taking operation choice
            System.out.println("\n--------------------------------------------------");
            System.out.println("\nMenu:\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Modulus\n8. Power\n9. Square Root\n10. View History\n11. Exit\n");
            System.out.print("Enter your choice: ");
            try {
                operationChoice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a number between 1 and 11.\n");
                sc.next(); // clear invalid input
                continue;
            }

            // Taking inputs based on operation
            if(operationChoice == 11) {
                break;
            } else {
                if (operationChoice >= 1 && operationChoice <= 4 || operationChoice == 7 || operationChoice == 8) {
                    System.out.print("Enter two numbers: ");
                    try {
                        input1 = sc.nextInt();
                        input2 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input. Please enter valid integers.\n");
                        sc.next(); // clear invalid input
                        continue;
                    }

                    Calc obj = new Calc(input1, input2);
                     switch (operationChoice) {
                        case 1: result = obj.add(); break;
                        case 2: result = obj.sub(); break;
                        case 3: result = obj.mul(); break;
                        case 4: result = obj.div(); 
                                if (result == -1) {
                                    System.out.println("Please try again with valid inputs.\n");
                                    continue;
                                }
                                break;
                        case 7: result = obj.mod(); break;
                        case 8: result = obj.pow(); break;
                    }
                } else if (operationChoice == 5 || operationChoice == 6 || operationChoice == 9) {
                    System.out.print("Enter the number: ");
                    try {
                        input1 = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nInvalid input. Please enter valid integer.\n");
                        sc.next(); // clear invalid input
                        continue;
                    }

                    Calc obj = new Calc(input1);
                    switch (operationChoice) {
                        case 5: result = obj.square(); break;
                        case 6: result = obj.cube(); break;
                        case 9: result = obj.sqrt();
                                if (result == -1) {
                                    System.out.println("Please try again with valid input.\n");
                                    continue;
                                }
                                break;
                    }
                } else if (operationChoice == 10) {
                    System.out.println("History feature is under development.\n");
                } else {
                    System.out.println("Invalid choice! Please try again. \n");
                    continue;
                }

                // Exit condition
                System.out.println("\n\nDo you want to continue? (1 for Yes / 0 for No): ");
                try{
                    continueChoice = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("\nInvalid input. Exiting by default ... \n");
                    continueChoice = 0;
                    continue;
                }
            }
        } while (continueChoice != 0);

        sc.close();
        System.out.println("\n\nAdios .... See you later!");
        System.out.println("\n--------------------------------------------------\n");

    }
}


/*

✅ Calculator Project Improvement Checklist

A. Code Structure & Organization

 Move menu display to a separate method

 Move input-taking logic to a separate method

 Move operation execution to its own method

 Separate handlers for:

 two-input operations

 single-input operations

 history feature

 Keep main() small and readable

B. Input Validation

 Create a general method like getValidatedInt(prompt)

 Handle invalid numeric inputs

 Handle division by zero

 Handle negative inputs for sqrt, factorial, etc.

 Validate menu choices (1–11)

C. Error Handling

 Print meaningful error messages

 Retry input when user makes a mistake

 Avoid program crashes by catching exceptions

D. History Feature

 Store performed operations

 Include:

 operation name

 input values

 result

 timestamp (optional)

 Display history when chosen

 Limit history size (optional)

E. File Handling (Optional but great improvement)

 Save history to a file on exit

 Load history from file on startup

 Use text/CSV/JSON format

F. UI/Experience Enhancements

 Clear screen between operations (if supported)

 More user-friendly messages

 Display results in a clean formatted way

 Add a small pause OR animation (optional)

G. Additional Operations (Optional Upgrades)

 Factorial

 Logarithm (log, ln)

 Trigonometric functions

 Percentage calculation

 Absolute value

 Exponent with double values

H. OOP Improvements

 Consider making operations static

 Or use a single Calc object instead of creating a new one every time

 Or use an interface Operation and individual operation classes (advanced)

I. Code Quality Enhancements

 Add comments explaining tricky logic

 Use meaningful variable names

 Avoid repetition (DRY principle)

 Use constants for menu values if needed

 Use enums for operations (optional but clean)

 */