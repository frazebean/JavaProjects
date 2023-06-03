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
            System.out.print("Enter array " + array[i+1] + ": ");
            userInput = input.nextInt();
            input.nextLine();
            array[i] = userInput;
        }

    }

    public static int[] bubbleSort(int[] pArray)
    {
        int temp;

        for(int pass = 0; pass < (pArray.length - 1) - 1; pass++)
        {
            for(int i = 0; i < (pArray.length - 1 - pass) - 1; i++)
            {
                if(pArray[i] > pArray[i+1])
                {
                    temp = pArray[i];
                    pArray[i] = pArray[i+1];
                    pArray[i+1] = temp;
                }
            }
        }

        return pArray;
    }
}