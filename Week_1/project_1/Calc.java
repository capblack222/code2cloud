package Week_1.project_1;
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class Calc {
    int n1, n2, res;
    void Calc(int a, int b){
        n1 = a;
        n2 = b;
    }
    void Calc(int a){
        n1 = a;
    }
    void printRes(){
        System.out.println("Result is: " + res);
    }
    void add(){
        res = n1 + n2;
        System.out.println("Addition is: " + res);
    }
    void sub(){
        res = n1 - n2;
        System.out.println("Subtraction is: " + res);
    }
    void mul(){
        res = n1 * n2;
        System.out.println("Multiplication is: " + res);
    }
    void div(){ 
        res = n1 / n2;
        System.out.println("Division is: " + res);
    }
    void square(){
        res = n1 * n1;
        System.out.println("Square is: " + res);
    }
    void cube(){
        res = n1 * n1 * n1;
        System.out.println("Cube is: " + res);
    }
    void mod(){
        res = n1 % n2;
        System.out.println("Modulus is: " + res);
    }
    void pow(){
        res = (int) Math.pow(n1, n2);
        System.out.println("Power is: " + res);
    }
    void sqrt(){
        res = (int) Math.sqrt(n1);
        System.out.println("Square Root is: " + res);
    }

    public static void main(String[] args) {
        System.out.println("\n\nHello, There! \nWelcome to the Calculator Program");
        Scanner sc = new Scanner(System.in);
        Calc obj = new Calc();
        int choice, num1, num2;
        // System.out.println();
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("\nMenu:\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Modulus\n8. Power\n9. Square Root\n10. Exit\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();
            if(choice == 10) {
                System.out.println("Adios .... See you later!");
                System.out.println("\n--------------------------------------------------\n");
                break;
            } else {
                if (choice >= 1 && choice <= 4 || choice == 7 || choice == 8) {
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    obj.Calc(num1, num2);
                } else if (choice == 5 || choice == 6 || choice == 9) {
                    System.out.print("Enter one number: ");
                    num1 = sc.nextInt();
                    obj.Calc(num1);
                } else {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }
                switch (choice) {
                    case 1: obj.add(); break;
                    case 2: obj.sub(); break;
                    case 3: obj.mul(); break;
                    case 4: obj.div(); break;
                    case 5: obj.square(); break;
                    case 6: obj.cube(); break;
                    case 7: obj.mod(); break;
                    case 8: obj.pow(); break;
                    case 9: obj.sqrt(); break;
                    default: System.out.println("Invalid choice! Please try again.");
                }
                System.out.print("\nDo you want to continue? (0 for No / 1 for Yes): ");
                choice = sc.nextInt();
            }
        } while (choice != 0);
        if(choice == 0) {
            System.out.println("\n\nAdios .... See you later!");
            System.out.println("\n--------------------------------------------------\n");
        }
        sc.close();
    }
}

/*
 * ⚠️ Areas to Improve

Constructor misuse:

You wrote void Calc(int a, int b) → that’s not a constructor, it’s just a method (constructors don’t have a return type).

Should be:

Calc(int a, int b) { ... }
Calc(int a) { ... }


Or even better, drop these and just use setValues() methods for clarity.

Division edge case:

No handling for division by zero → program will crash.

Fix with:

if (n2 == 0) {
    System.out.println("Error: Division by zero not allowed");
    return;
}


Code structure:

The Calc class mixes business logic and printing results.

Cleaner design: Calc should only compute and return the result, and main should handle printing.

Unused import:

import java.nio.channels.Pipe.SourceChannel; is not needed.

Variable naming:

n1, n2, res → okay for practice, but firstNumber, secondNumber, result are more readable.

Scanner choice reuse:

Using choice both for menu selection and continue prompt → confusing. Better to use two variables.

⭐ Suggested Additions

Add error handling for invalid inputs (non-numbers) using try-catch.

Add continuous calculation mode (use last result as next n1).

Maybe implement a command history list to store results.

 */