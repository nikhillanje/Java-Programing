/*
Nmae:-NikhilLanje
Class:-SY-A
Suject:-Java
Roll No:-113
*/
import java.util.Random;

public class Dice_Roll_Frequency 
{
    public static void main(String[] args) 
    {
        int numRolls = 100;
        int[] frequency = new int[6]; 

        Random random = new Random();

        for (int i = 0; i < numRolls; i++) {
            int roll = random.nextInt(6) + 1; 
            frequency[roll - 1]++;
        }

        displayFrequency(frequency);
    }

    public static void displayFrequency(int[] frequency) 
    {
        for (int face = 0; face < frequency.length; face++) 
        {
            System.out.println("Face " + (face + 1) + ": " + frequency[face] + " times");
        }
    }
}
//output//
/*
java -cp /tmp/MvAWM4wyD8/DiceRollFrequency
Face 1: 24 times
Face 2: 21 times
Face 3: 16 times
Face 4: 12 times
Face 5: 13 times
Face 6: 14 times

=== Code Execution Successful ===
*/

