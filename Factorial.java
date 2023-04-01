import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        // Lines 7-9: Initialising variables and making Scanner method.
        Scanner sc = new Scanner(System.in);
        boolean nLoop = true, rMaxLoop = true;
        int n = 0, rMax = 0, finalResult = 0, index = 0;

        // Lines 12 to 24: Loop over user input of 'n' until value is within specified parameters.
        while (nLoop)
        {
            System.out.print("Enter n: ");
            n = sc.nextInt();

            if (n >= 5 && n <= 50)
            {
                nLoop = false;
            }
            else
            {
                System.out.println("Input must be between 5 (inclusive) and 50 (inclusive).");
            }
        }

        // Lines 28 to 41: Loop over user input of 'r' until value is within specified parameters.
        while (rMaxLoop)
        {
            System.out.print("Enter r: ");
            rMax = sc.nextInt();

            if (rMax >= 2 && rMax < n)
            {
                rMaxLoop = false;
            }
            else
            {
                System.out.println("Input must be between 2 (inclusive) and n (exclusive).");
            }
        }

        // Line 44: Creating an array size of rMax - 1.
        int[] rMaxArray = new int[rMax - 1];

        for (int r = 2; r <= rMax; r++)  // This line will loop over each r value from 2 to rMax.
        {
            int numeratorFact = 1, denominatorFact = 1;  // Initialises numerator and denominator factorials.

            for (int i = 1; i <= n; i++)  /* Loops over the n factorials. For example, n=5 would loop over
                                             numbers 1, 2, 3, 4, 5. */
            {
                numeratorFact = numeratorFact * i;  // Numerator factorial calculated (n!)
            }
            for (int j = 1; j <= (n-r); j++)  /* Loops over the (n-r) factorials. The r value is dependent on the
                                                 value of 'r' in the outer FOR LOOP. */ 
            {
                denominatorFact = denominatorFact * j;  // Denominator factorial calculated (n-r)!
            }

            finalResult = numeratorFact / denominatorFact;  // Divide numerator and denominator to get r value result.
            
            for (index = 0; index < 1; index++) // Loops once for each r value to insert result into array index.
            {
                rMaxArray[index] = finalResult;
                System.out.print(rMaxArray[index] + " ");
            }

        }

        sc.close();
    }
}
