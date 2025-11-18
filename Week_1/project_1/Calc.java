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
    void add(){
        res = firstNumber + secondNumber;
        System.out.println("Addition is: " + res);
    }
    void sub(){
        res = firstNumber - secondNumber;
        System.out.println("Subtraction is: " + res);
    }
    void mul(){
        res = firstNumber * secondNumber;
        System.out.println("Multiplication is: " + res);
    }
    void div(){ 
        if (secondNumber == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return;
        }
        res = firstNumber / secondNumber;
        System.out.println("Division is: " + res);
    }
    void square(){
        res = firstNumber * firstNumber;
        System.out.println("Square is: " + res);
    }
    void cube(){
        res = firstNumber * firstNumber * firstNumber;
        System.out.println("Cube is: " + res);
    }
    void mod(){
        res = firstNumber % secondNumber;
        System.out.println("Modulus is: " + res);
    }
    void pow(){
        res = (int) Math.pow(firstNumber, secondNumber);
        System.out.println("Power is: " + res);
    }
    void sqrt(){
        res = (int) Math.sqrt(firstNumber);
        System.out.println("Square Root is: " + res);
    }

    public static void main(String[] args) {
        System.out.println("\n\nHello, There! \nWelcome to the Calculator Program");
        Scanner sc = new Scanner(System.in);
        int input1, input2, operationChoice, continueChoice = 0;
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
            if(operationChoice == 10) {
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
                        case 1: obj.add(); break;
                        case 2: obj.sub(); break;
                        case 3: obj.mul(); break;
                        case 4: obj.div(); break;
                        case 7: obj.mod(); break;
                        case 8: obj.pow(); break;
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
                        case 5: obj.square(); break;
                        case 6: obj.cube(); break;
                        case 9: obj.sqrt(); break;
                    }
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

⭐ Suggested Additions

Add error handling for invalid inputs (non-numbers) using try-catch.

Add continuous calculation mode (use last result as next n1).

Maybe implement a command history list to store results.

 */