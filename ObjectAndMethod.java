class circle 
{
    public double r=5;

    public double circmf()
    {
        return 2*3.14*4;
    }
    public double area ()
    {
        return 3.14*r*r;
    }
}



public class ObjectAndMethod 
{
    static int number (int n)
    {
        return n;
    }
 public static void main(String[] args) 
 {
    int x=5;
    x=number(x);

    circle c1=new circle();
    System.out.println(+c1.circmf());
    System.out.println(c1.area());
    System.out.println(x);
    
 }
    
}
