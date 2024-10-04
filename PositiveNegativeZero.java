

import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args) 
    {
        int number,positive=0,negative=0,zero=0,i;
        Scanner scanner = new Scanner(System.in);
         

        System.out.println("Enter five numbers:");

        for (i = 0; i < 5; i++) 
        {
             number = scanner.nextInt();

            if (number > 0) 
            {
                positive++;
            } else if (number < 0) 
            {
                negative++;
            } else 
            {
               zero++;
            }
        }

        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of zeros: " + zero);
    }
}

/*Output
 * Enter five numbers:
 * 5
 * 6
 * -9
 * -6
 * 0
 * Number of positive numbers: 2
 * Number of negative numbera: 2
 * Number of zeros: 1
 */
