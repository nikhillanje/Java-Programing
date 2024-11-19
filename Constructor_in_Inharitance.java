class Base1
{
    public Base1()
    {
        System.out.println("Base Constructor");
    }
}
class Derived1 extends Base1
{
 public Derived1()
 {
    System.out.println("Derived Constructor");
 }
}


public class Constructor_in_Inharitance{
public static void main(String[] args) {
    Derived1 d = new Derived1();
   
}    
}
//output//
/* the class Derived1 Constructor are invoke by creating the object 
   of Derived Class but also class Base1 constructor are invoke 
   Automatically!! 
 */
