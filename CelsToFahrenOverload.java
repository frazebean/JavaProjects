// Author: Ajmel Muadz
// Date created: 3/6/2023
// License: Don't have time for that lol this is just basic university homework. Copy as you
//          please bro.

import java.util.*;

public class CelsToFahrenOverload 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        char unit;
        double temperature, result;

        System.out.println("Welcome to the temperature unit converter. Please choose a unit" +
        "\nand enter the temperature value. Units are (C)elsius and (F)ahrenheit.");

        System.out.print("Enter unit: ");
        unit = input.next().charAt(0);

        System.out.print("Enter temperature value: ");
        temperature = input.nextDouble();
        input.nextLine();

        if(unit == 'C' || unit == 'c')
        {
            result = celsToFahren(temperature);
            System.out.println("Your (celsius) temperature in fahrenheit is: " + result);
            
            // celsToFahren() refers to two overloaded methods.
        }
        else if(unit == 'F' || unit == 'f')
        {
            result = fahrenToCels(temperature);
            System.out.println("Your (fahrenheit) temperature in celsius is: " + result);

            // fahrenToCels() refers to two overloaded methods.
        }
        // No input validation needed as my assignment said I don't need to do it.

        input.close();
    }

    // Two method belows are overloaded.
    public static double celsToFahren(double pCelsiusTemp)
    {
        double fahrenheit;
        fahrenheit = ((pCelsiusTemp * 9) / 5) + 32;
        return fahrenheit;
    }
    public static double celsToFahren(int pCelsiusTemp)
    {
        double fahrenheit;
        fahrenheit = (((double)pCelsiusTemp * 9) / 5) + 32;
        return fahrenheit;
    }

    // These two methods below are also overloaded.
    public static double fahrenToCels(double pFahrenTemp)
    {
        double celsius;
        celsius = ((pFahrenTemp - 32) * 5) / 9;
        return celsius;
    }
    public static double fahrenToCels(int pFahrenTemp)
    {
        double celsius;
        celsius = (((double)pFahrenTemp - 32) * 5) / 9;
        return celsius;
    }
}
