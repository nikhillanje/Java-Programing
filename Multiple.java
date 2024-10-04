Name-Nikhil Lanje
Class SY-1
Batch-1
Roll No-113
Subject-OOPJ

import java.util.Scanner;
public class Multiple
{
public static void main(String args[])
{
int a,b;
Scanner sc= new Scanner(System.in);

System.out.println("Enter the  first Number");
a=sc.nextInt();

System.out.println("Enter the Secound Number");
b=sc.nextInt();

if(a%b==0)
{
System.out.println("it is multiple");
}
else
{
System.out.println("it is not multiple");
}
}
}
/* OutPut
Microsoft Windows [Version 10.0.19045.4651]
(c) Microsoft Corporation. All rights reserved.

C:\Users\lab6>E:

E:\>cd Nikhil

E:\Nikhil>set path=C:\Program Files\Java\jdk1.8.0_144\bin

E:\Nikhil>set classpath=;.classpath.;

E:\Nikhil>javac Multiple.java

E:\Nikhil>java Multiple
Enter the  first Number
10
Enter the Secound Number
5
it is multiple

E:\Nikhil>java Multiple
Enter the  first Number
6
Enter the Secound Number
4
it is not multiple

E:\Nikhil>
*/