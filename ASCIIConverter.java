// AUTHOR: frazebean

import java.util.*;
public class ASCIIConverter 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        char uppercase;
        char lowercase;
        int asciiValue;

        System.out.print("Please enter an uppercase character: "); // Asks the user with prompt
        uppercase = input.next().charAt(0);  // User input for previous prompt
        asciiValue = (int)(uppercase); // Type cast uppercase letter into ASCII value
        System.out.println("The ASCII value of " + "'" + uppercase + "'" + " is: " + asciiValue);

        lowercase = (char)(asciiValue + 32); // Convert uppercase to lowercase
        System.out.println("The lowercase value of " + "'" + uppercase + "'" + " is: " + "'" + lowercase + "'");
        input.close();
    }
}
