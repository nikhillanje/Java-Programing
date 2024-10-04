import java.util.Scanner;

public class ADD_SUB_MULTI_AVG_SML_LRG
{
    public static void main(String[] args) 
    {
        double a,b,c,add,multi,avg,smallest,largest,temp1,temp2;

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER");
        a=sc.nextDouble();

        System.out.println("ENTER THE SECOUND NUMBER");
        b=sc.nextDouble();

        System.out.println("ENTER THE THIRD NUMBER");
        c=sc.nextDouble();

        add=a+b+c;
        System.out.println("ADDITION IS:"+add);

        avg=((a+b+c)/3);
        System.out.println("AVERAGE IS:"+avg);

        multi=a*b*c;
        System.out.println("MULTIPLY IS:"+multi);

        temp1=a<b?a:b;
        smallest=c<temp1?c:temp1;
        System.out.println("SMALLEST NUMBER IS:"+smallest);

        temp2=a>b?a:b;
        largest=c>temp2?c:temp2;
        System.out.println("LARGEST NUMBER IS:"+largest);
        
    }
}
/*OUTPUT*/


/* 
ENTER THE FIRST NUMBER
10
ENTER THE SECOUND NUMBER
20
ENTER THE THIRD NUMBER
30
ADDITION IS:60.0
AVERAGE IS:20.0
MULTIPLY IS:6000.0
SMALLEST NUMBER IS:10.0
LARGEST NUMBER IS:30.0 
*/