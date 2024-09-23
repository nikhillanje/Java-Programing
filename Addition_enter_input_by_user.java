import java.util.Scanner;

public class Add_enter_by_user
{
    public static void main(String[] args)
    {


        System.out.println("take input");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the secound number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Your Sum");
        System.out.println(sum);
    }

        
}