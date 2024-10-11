/*
Nmae:-NikhilLanje
Class:-SY-A
Suject:-Java
Roll No:-113
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_Array_in_Decending_Order
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        Integer[] array = new Integer[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println("Array sorted in descending order: " + Arrays.toString(array));

    }
}
//output//
/*
java -cp /tmp/Tl1ymhXgWt/Sort_Array_in_Decending_Order
Enter the number of elements in the array: 4
Enter the elements of the array:
1000
988
10000
600000
Array sorted in descending order: [600000, 10000, 1000, 988]

=== Code Execution Successful ===
*/