class A
{
    int i,j;
    void showij()
    {
        System.out.println("i is "+i );
        System.out.println("j is "+j );
    }

}

class B extends A
{
 int k;

 void showk()
 {
    System.out.println("k is "+k);

 }
 void sum()
 {
    System.out.println("sum is "+(i+j+k));
 }
}

public class Simple_Inharitance 
{
    public static void main(String[] args) 
    {
        A obj1=new A();

        obj1.i=10;
        obj1.j=20;

        System.out.println("content of onj1 id ");
        obj1.showij();

        System.out.println();

        B obj2=new B();

        obj2.i=7;
        obj2.j=5;
        obj2.k=4;

       obj2.sum();

        
    }
    
}
