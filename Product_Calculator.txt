/*
Name:- Nikhil Lanje
Class:-SY A
Subject:-OOPs in JAVA
Roll No:- 113
*/
import java.util.Scanner;
public class Prod_calc
{
    public static void main(String args[])
    {
        final double PRODUCT_1=2.98;
        final double PRODUCT_2=2.98;
        final double PRODUCT_3=2.98;
        final double PRODUCT_4=2.98;
        final double PRODUCT_5=2.98;
        double total=0.0;
        
        Scanner sc=new Scanner (System.in);
        
        System.out.println("enter the product number (1-5)and quantity of sold");
        
        System.out.println("enter the negative value to exit");
        
        while(true)
        {
            System.out.println("enter the product number");
            
            int productnumber=sc.nextInt();
            if (productnumber<0)
            {
                System.out.println("invalid choice");
                break;
            }
            System.out.println("number of product quantity sold");
            int quantity=sc.nextInt();
            double productprice;
            switch(productnumber)
            {
                case 1:
                    productprice=PRODUCT_1;
                    break;
                    
                case 2:
                    productprice=PRODUCT_2;
                    break;
                    
                case 3:
                    productprice=PRODUCT_3;
                    break;
                    
                case 4:
                    productprice=PRODUCT_4;
                    break;
                    
                case 5:
                    productprice=PRODUCT_5;
                    break;
                    
                default:
                System.out.println("invalid product");
                continue;
                
            }
            total=total+(productprice*quantity);
        }
        System.out.printf("total value of product is %f",total);
        
    }
}

//output//
/*
java -cp /tmp/oDApBAVxyh/Prod_calc
enter the product number (1-5)and quantity of sold
enter the negative value to exit
enter the product number
1
number of product quantity sold
12
enter the product number
2
number of product quantity sold
43\
enter the product number
2
number of product quantity sold
32
enter the product number
6
number of product quantity sold
45
invalid product
enter the product number
4
number of product quantity sold
12
enter the product number
-1
invalid choice
total value of product is 295.020000
=== Code Execution Successful ===
*/