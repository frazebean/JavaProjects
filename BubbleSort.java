// CEO of not understanding the code I wrote.
// AUTHOR: Ajmel Muadz
// DATE CREATED: 3/6/2023
// LICENSE: No license lol just use it if you want to.

import java.util.*;

public class BubbleSort
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[8];
        int userInput;

        System.out.println("Hello. Please enter 8 integers to be sorted.\n");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter integer " + (i+1) + ": ");
            userInput = input.nextInt();
            array[i] = userInput;
        }

        System.out.println("The array unsorted is: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("The array sorted is: " + Arrays.toString(array));

        input.close();
    }

    public static int[] bubbleSort(int[] pArray)
    {
        int temp;

        for(int pass = 0; pass <= (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i <= (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i] > pArray[i+1])
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(pArray));
        }

        return pArray;
    }
}