import java.util.*;
public class MatrixExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int columns = 0, rows = 0;

        System.out.print("Enter width (cols): ");
        columns = sc.nextInt();

        System.out.print("Enter height (rows): ");
        rows = sc.nextInt();

        int[][] twoDArray = new int[rows+1][columns+1];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                twoDArray[rows][columns] = i * j;
                System.out.print(twoDArray[rows][columns] + " ");
            }
            
            System.out.println("");
        }
        sc.close();

    }
}
