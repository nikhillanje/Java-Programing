/*Name:- Nikhil Lanje
Class:-SY-A
Roll No:-113
Sunject:-java
*/
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_in_Assending_Order
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Array sorted in ascending order: " + Arrays.toString(array));

    }
}
//output//
/*
java -cp /tmp/1RNpFxAl6W/SortArray
Enter the number of elements in the array: 5
Enter the elements of the array:
7
5
2
4
1
Sorted array in ascending order: [1, 2, 4, 5, 7]

=== Code Execution Successful ===
*/