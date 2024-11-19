class Base
{
    int x;
    int getX()
    {
        return x;
    }
    void setX(int p)
    {
        System.out.println("this is base class");
        x=p;
    }
    void printMe()
    {
        System.out.println(" this is base method");
    }
}
class Derived extends Base{
    int y;

    int getY()
    {
        return y;
    }
    void setY(int q)
    {
        System.out.println("this is derived class");
        y=q;
    }
}



public class Inharitance {
public static void main(String[] args) {
    Base b = new Base();    
    Derived d = new Derived();

    b.setX(20);
    System.out.println(b.getX());

    d.setX(10);
    System.out.println(d.getX());
} 
}
