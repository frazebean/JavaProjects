// AUTHOR: frazebean

import java.util.*;

public class MenuOG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner class for user input.

        boolean menu = true;
        int userChoice, num1, num2;

        while (menu){
            try {
                System.out.println("What would you like to do?");
                System.out.println("    > 1. Sum of 2 Integers");
                System.out.println("    > 2. Product of 2 Integers");
                System.out.println("    > 3. Determine if 2 Integers are Divisible");
                System.out.println("    > 0. Exit");
    
                userChoice = sc.nextInt();  // Integer variable to store user's choice of operation.
    
                if (userChoice == 0){
                    System.out.println("Goodbye");
                    menu = false;  // Loop terminates if user chooses to exit.
                }
                // ELSE-IF statement below for when user input is not 1, 2 or 3.
                else if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Your choice should be between 0 and 3.");
                }
                // ELSE statement applies if user enters the correct choice of operations of 1, 2 or 3.
                else {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();
    
                    switch (userChoice){
                        case 1:
                            System.out.println(num1 + num2);
                            break;
                        case 2:
                            System.out.println(num1 * num2);
                            break;
                        case 3:
                            /* Modulus operation below checks if division results in a 0 remainder.
                             * A remainder return of 0 means the numbers are divisible.
                             */
                            if (num1 % num2 == 0){
                                System.out.println("Yes");
                                break;
                            }
                            else {
                                System.out.println("No");
                                break;
                            }
                    }
                }
            }
            catch (InputMismatchException error){
                sc.next();
                System.out.println("Input format error, please enter a whole number.");
            }
        }
        sc.close(); // Close scanner because VS Code told me to do so.
    }
}
