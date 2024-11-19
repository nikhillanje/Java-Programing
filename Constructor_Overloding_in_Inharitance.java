class First
{
    First()
    {
    System.out.println("I am First Consructor");
    }
    First(int x)
    {
     System.out.println("overloded first");
    }
}

class Secound extends First
{
    Secound()
    {
        System.out.println("I am Secound Constructor");
    }
    Secound(int x,int y)
    {
        super(x);
        System.out.println("overloded Secound");

    }

}

class Third extends Secound
{
 Third()
 {
    System.out.println("I am Third Constructor");
 }
 Third(int x,int y,int z)
 {
    super(x,y);
    System.out.println("overloded Third");
 }
}

public class Constructor_Overloding_in_Inharitance {
public static void main(String[] args) {
    System.out.println("content of constructor");
    Third q = new Third();

    System.out.println();
    
    System.out.println("content of overloded constructor");
    Third t = new Third(1,2,3);
    
}    
}
