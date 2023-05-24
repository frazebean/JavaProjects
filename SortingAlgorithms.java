import java.util.Arrays;

public class SortingAlgorithms 
{
    public static void main(String[] args) 
    {
        // Methods are:
        // basicExplanation()
        // basicBubbleSort()
        // improvedBubbleSort()
        // insertionSort()

        /* NOTE: Run ONE method in the main method unless you love getting confused.
           This program is just to help me understand sorting algorithms. They're
           quite fun to learn in my opinion :) */
    }

    // This is a basic explanation of how swapping values is made possible in Java.
    public static void basicExplanation()
    {
        int valA = 16;
        int valB = 2;
        int temp;

        temp = valA;
        valA = valB;
        valB = temp;

        System.out.println(valA + " " + valB);
    }

    public static void basicBubbleSort()
    {
        int temp;
        int[] list = {88, 33, 99, 22, 54};

        // Fully working bubble sort algorithm (ascending order)
        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = 0; j < list.length - 1; j++)
            {
    
                if(list[j] < list[j+1])  // Change '>' to '<' for descending order
                {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }

    public static void improvedBubbleSort()
    {
        int temp;
        int[] list = {88, 33, 99, 22, 54};

        // Fully working bubble sort algorithm (ascending order)
        int comparisonsToMake = list.length - 1;  // Improvement made
        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = 0; j < comparisonsToMake; j++)
            {
    
                if(list[j] < list[j+1])  // Change '>' to '<' for descending order
                {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
            comparisonsToMake--;  // Improvement made
        }
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort()
    {
        int i;
        int j;
        int temp;
        int[] list = {90, 85, 65, 95, 75};

        // Fully working insertion sort algorithm (ascending order)
        i = 1;
        while(i < list.length)
        {
            temp = list[i];
            j = i - 1;
            while(j >= 0 && list[j] > temp)  // Change '>' (second operand) to '<' for descending
            {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
            i++;
        }

        System.out.println(Arrays.toString(list));
    }
}
