import java.util.*;
public class UnitConverter
{
    public static void main(String[] args)
    {
        double[] array = new double[3];
        Scanner input = new Scanner(System.in);

        System.out.println("1. Convert centimetres to inches");
        System.out.println("2. Convert kilometres to miles");
        System.out.println("3. Exit the program.");

        int menuChoice = input.nextInt();

        while (menuChoice != 3)
        {
            switch(menuChoice)
            {
                case 1:
                    double cm;
                    for (int count = 0; count < 3; count++)
                    {
                        System.out.print("Enter cm: ");
                        cm = input.nextDouble();
                        double inches = convertToInches(cm);
                        array[count] = inches;
                    }
                    printTheLines(array);
                    break;
                
                case 2:
                    double km;
                    for (int count = 0; count < 3; count++)
                    {
                        System.out.print("Enter km: ");
                        km = input.nextDouble();
                        double miles = convertToMiles(km);
                        array[count] = miles;
                    }
                    printTheLines(array);
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;
            }
        }
        input.close();
    }
    private static double convertToInches(double pCM)
    {
        double pInches = pCM / 2.54;
        return pInches;
    }
    private static double convertToMiles(double pKM)
    {
        double pMiles = pKM / 1.609;
        return pMiles;
    }
    private static void printTheLines(double[] pArray)
    {
        for (int index = 0; index < pArray.length; index++)
        {
            System.out.println(pArray[index]);
        }
    }
}