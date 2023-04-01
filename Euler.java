import java.util.*;
public class Euler 
{
    public static void main(String[] args)
    {
        // Lines 7 to 10: Make scanner class and initialising variables.
        Scanner sc = new Scanner(System.in);
        boolean inputLoop = true;
        int numOfTerms = 0;
        double termValue = 0, e = 0;

        while (inputLoop)  // User must enter a number of terms within specified parameters.
        {
            System.out.print("Enter number of terms: ");
            numOfTerms = sc.nextInt();

            if (numOfTerms >= 6 && numOfTerms <= 100)
            {
                inputLoop = false;
            }
            else
            {
                // Specified parameter is described in the PRINT statement below.
                System.out.println("Input must be between 6 (inclusive) and 100 (inclusive).");
            }
        }

        double[] eulerArray = new double[numOfTerms + 1];  // Array made with size 1 larger than user's numOfTerms.
        
        eulerArray[0] = 1;  // First term in Euler's infinite series is always 1 (because 1/0! = 1).
        
        for (int term = 1; term < numOfTerms; term++)  // Loop for every term in the series based on user's number of terms.
        {
            double denominatorCalc = 1.0;  // Denominator's factorial calculation is initialised to 1 for every term.

            for (double factorial = 1.0; factorial <= term; factorial++)  /* Loops through every number in denominator's
                                                                             factorial. Example: 5! would loop through numbers:
                                                                             1, 2, 3, 4, 5. */
            {
                denominatorCalc = denominatorCalc * factorial;  // Factorial calculation.
            }
            termValue = 1 / denominatorCalc;  // Actual term value. 1 divided by the denominator factorial calculation.
            eulerArray[term] = termValue; // Term values are stored in the array initialised on line 28.
            
        }

        // Lines 47 to 51: Add every number in array to get the result: e.
        for (int index = 0; index < eulerArray.length; index++)
        {
            e = e + eulerArray[index];
        }

        System.out.println("Result is " + e);

        sc.close();
    }
}
