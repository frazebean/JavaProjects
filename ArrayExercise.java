// AUTHOR: frazebean

import java.util.*;

public class ArrayExercise{

    public static void main(String[] args){

        // Making Scanner and Random classes.
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = 0;
        boolean prompt = true;

        // WHILE loop used to force user to enter array length between 1 and 20.
        while (prompt){

            System.out.print("Choose an array length between 1 and 20: ");
            arrayLength = sc.nextInt();
            System.out.println("");

            if (arrayLength < 1 || arrayLength > 20){

                System.out.println("Invalid array length chosen.\n");
            }
            else{
                
                prompt = false;
            }
        }

        int[] array = new int[arrayLength+1];  // Array size instantiated with user input of array length.

        /* NOTE: 'array.length' is used to access the 'array' variable's length for the following
         * FOR loop. Not to be confused with the 'arrayLength' variable, which stores the user's preferred
         * size for the array. */
        for (int item = 1; item < array.length; item++){

            array[item] = random.nextInt(arrayLength+1);  // Random number assigned to every item in the array.
            System.out.println("The value of element " + item + " of the array is " + array[item] + ".");
        }
        sc.close();
    }
}
