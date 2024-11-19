import java.util.Scanner;
public class Array_Assending_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int array[]=new int[5];
        int temp;
        System.out.println("Enter the elemets of An Array");
        for(int i=0;i<=4;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++)
        {
            for(int j=i+1;j<=4;j++)
            {
             if(array[i]>=array[j])
             {
              temp=array[i];
              array[i]=array[j];
              array[j]=temp;
             }
            }
        }

        System.out.println("Your Sorted Array Is");

        for(int i=0;i<=4;i++)
        {
            System.out.printf("%d\t",array[i]);
        }

    }
    
}
