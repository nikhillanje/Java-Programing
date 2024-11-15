import java.util.Scanner;   

public class Word_Search 
{
    private static final int SIZE = 10; 
    private static char[][] table = new char[SIZE][SIZE]; 

    // Method to initialize the table with random letters
    private static void initializeTable() 
    {
        // Use a Random object to generate random characters
        java.util.Random random = new java.util.Random();
        
        // Fill the table with random uppercase letters
        for (int i = 0; i < SIZE; i++) 
        {
            for (int j = 0; j < SIZE; j++) 
            {
                // Generate a random uppercase letter (A-Z)
                table[i][j] = (char) ('A' + random.nextInt(26));
            }
        }
    }

    // Method to display the table
    private static void displayTable() 
    {
        for (int i = 0; i < SIZE; i++) 
        {
            for (int j = 0; j < SIZE; j++) 
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check if a word is in the table
    private static boolean findWord(String word) 
    {
        int length = word.length();

        // Check rows (horizontal)
        for (int i = 0; i < SIZE; i++) 
        {
            for (int j = 0; j <= SIZE - length; j++) 
            {
                if (checkRight(i, j, word)) return true;
            }
        }

        // Check columns (vertical)
        for (int i = 0; i <= SIZE - length; i++) 
        {
            for (int j = 0; j < SIZE; j++) 
            {
                if (checkDown(i, j, word)) return true;
            }
        }

        return false; // word not found
    }

    // Check right (horizontal)
    private static boolean checkRight(int row, int col, String word) 
    {
        for (int i = 0; i < word.length(); i++) 
        {
            if (table[row][col + i] != word.charAt(i)) return false;
        }
        return true;
    }

    // Check down (vertical)
    private static boolean checkDown(int row, int col, String word) 
    {
        for (int i = 0; i < word.length(); i++) 
        {
            if (table[row + i][col] != word.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        initializeTable();

        System.out.println("Word Search Table:");
        displayTable();

        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine().toUpperCase();

        if (findWord(word)) 
        {
            System.out.println("The word '" + word + "' is found in the table.");
        } 
        else 
        {
            System.out.println("The word '" + word + "' is NOT found in the table.");
        }

    }
}
