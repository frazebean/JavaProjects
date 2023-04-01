import java.util.*;

// AUTHOR: frazebean

public class CelsAndFaren{

    public static void main(String[] args){

        // Making scanner class and initialising all variables.
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        char unit;
        double temp, convertedTemp;

        // A WHILE 'true' statement that will keep looping until a condition makes it false.
        while (menu){

            System.out.println("What temperature scale are you working with?");
            System.out.println("    > (C)elsius");
            System.out.println("    > (F)ahrenheit");

            unit = sc.next().charAt(0); // Gets user's preferred temperature unit to be converted.

            switch (unit){
                
                /* If 'c'/'C' (Celsius), user inputs temperature in celsius. Relevant conversion
                   is then made and 'menu' is FALSE, exiting the loop. */
                case 'c': case 'C':
                    System.out.print("Please enter Celsius: ");
                    temp = sc.nextDouble();
                    convertedTemp = (9.0 / 5.0) * temp + 32.0;
                    System.out.println(temp + "C" + " = " + convertedTemp + "F");
                    menu = false;
                    break;
                
                /* If 'f'/'F' (Fahrenheit), user inputs temperature in fahrenheit. Relevant conversion
                   is then made and 'menu' is FALSE, exiting the loop. */
                case 'f': case 'F':
                    System.out.print("Please enter Fahrenheit: ");
                    temp = sc.nextDouble();
                    convertedTemp = ((temp - 32.0) * 5.0) / 9.0;
                    System.out.println(temp + "F" + " = " + convertedTemp + "C");
                    menu = false;
                    break;

                // If user does not input a relevant unit, an error will be displayed and the loop repeats.
                default:
                    System.out.println("Error, invalid item selected.");
            }
        }
        sc.close();
    }
}
