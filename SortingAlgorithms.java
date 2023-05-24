import java.util.Arrays;

public class SortingAlgorithms 
{
    public static void main(String[] args) 
    {
        // basicExplanation()
        // basicBubbleSort()
        // improvedBubbleSort()

        improvedBubbleSort();
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
        int comparisonsToMake = list.length - 1;
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
            comparisonsToMake--;
        }
        System.out.println(Arrays.toString(list));
    }
}
