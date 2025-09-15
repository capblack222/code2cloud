package Week_1.project_1;
import java.util.*;

public class Calc {
    int n1, n2, res;
    Calc(int a, int b){
        n1 = a;
        n2 = b;
    }
    Calc(int a){
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
        if (n2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return;
        }
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
        int num1, num2, ch = 1;
        String choice;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("\nMenu:\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Square\n6. Cube\n7. Modulus\n8. Power\n9. Square Root\n10. Exit\n");
            System.out.print("Enter your choice: ");
            choice = sc.next();
            System.out.println();
            try {
                ch = Integer.parseInt(choice);
                // System.out.println("Converted int: " + ch);
            } catch (NumberFormatException e) {
                System.out.println("Error: Not a valid number. Please enter a number between 1 and 10.");
                continue;
            }
            if(ch == 10) {
                System.out.println("Adios .... See you later!");
                System.out.println("\n--------------------------------------------------\n");
                break;
            } else {
                if (ch >= 1 && ch <= 4 || ch == 7 || ch == 8) {
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    Calc obj = new Calc(num1, num2);
                     switch (ch) {
                        case 1: obj.add(); break;
                        case 2: obj.sub(); break;
                        case 3: obj.mul(); break;
                        case 4: obj.div(); break;
                        case 7: obj.mod(); break;
                        case 8: obj.pow(); break;
                    }
                } else if (ch == 5 || ch == 6 || ch == 9) {
                    System.out.print("Enter one number: ");
                    num1 = sc.nextInt();
                    Calc obj = new Calc(num1);
                    switch (ch) {
                        case 5: obj.square(); break;
                        case 6: obj.cube(); break;
                        case 9: obj.sqrt(); break;
                    }
                } else {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }
                // Ask if the user wants to continue
                System.out.print("\nDo you want to continue? (0 for No / 1 for Yes): ");
                choice = sc.next();
                try {
                    ch = Integer.parseInt(choice);
                    // System.out.println("Converted int: " + ch);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Not a valid choice. Continuing by default.");
                    ch = -1; // default to continue
                    // break doYouWantToContinue;
                }
            }
        } while (ch != 0);
        if(ch == 0) {
            System.out.println("\n\nAdios .... See you later!");
            System.out.println("\n--------------------------------------------------\n");
        }
        sc.close();
    }
}

/*
 * ⚠️ Areas to Improve

Variable naming:

n1, n2, res → okay for practice, but firstNumber, secondNumber, result are more readable.

Scanner choice reuse:

Using choice both for menu selection and continue prompt → confusing. Better to use two variables.

⭐ Suggested Additions

Add error handling for invalid inputs (non-numbers) using try-catch.

Add continuous calculation mode (use last result as next n1).

Maybe implement a command history list to store results.

 */