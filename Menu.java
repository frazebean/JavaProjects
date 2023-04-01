import java.util.*;
public class Menu
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("What would you like to do?");
            System.out.println("    > 1. Sum of 2 Integers");
            System.out.println("    > 2. Product of 2 Integers");
            System.out.println("    > 3. Determine if 2 Integers are Divisible");
            System.out.println("    > 0. Exit");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    int sumValue1 = takeInput1();
                    int sumValue2 = takeInput2();
                    System.out.println(sum2Ints(sumValue1, sumValue2));
                    break;
                case 2:
                    int prodValue1 = takeInput1();
                    int prodValue2 = takeInput2();
                    System.out.println(prod2Ints(prodValue1, prodValue2));
                    break;
                case 3:
                    int divValue1 = takeInput1();
                    int divValue2 = takeInput2();
                    System.out.println(div2Ints(divValue1, divValue2));
                    break;

            }
        }
        while (choice != 0);
        sc.close();
    }

    private static int takeInput1()
    {
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        sc.close();
        return num1;
    }
    private static int takeInput2()
    {
        Scanner sc = new Scanner(System.in);
        int num2;

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sc.close();
        return num2;
    }
    private static int sum2Ints(int pNum1, int pNum2)
    {
        int sum = pNum1 + pNum2;
        return sum;
    }
    private static int prod2Ints(int pNum1, int pNum2)
    {
        int product = pNum1 * pNum2;
        return product;
    }
    private static int div2Ints(int pNum1, int pNum2)
    {
        int quotient = pNum1 / pNum2;
        return quotient;
    }
}
