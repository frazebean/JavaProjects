// AUTHOR: frazebean

import java.util.*;

public class PrintNum {
    public static void main(String[] args){

        // Making scanner class as well as initialising variables for lines 8 to 9.
        Scanner sc = new Scanner(System.in);
        int intNumber;

        System.out.print("Enter an integer number: ");
        intNumber = sc.nextInt();

        /* Following FOR loop starts from 1 and keeps looping until intNumber + 1.
           That is, it stops looping until intNumber. */
        for (int i = 1; i < intNumber + 1; i++){

            System.out.print(i + " ");
        }

        sc.close();
    }
}
