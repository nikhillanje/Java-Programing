class Emp{
    String name;
    int id;

    void printdertail()
    {
        System.out.println("My Name Is "+name );
        System.out.println("My Id Is "+id);
    }
}
public class Create_Own_Class{
    public static void main(String[] args) {
        System.out.println("Content Of Custom class ");

        Emp nikhil=new Emp();
        Emp vedant=new Emp();

        nikhil.name="NIKHIL LANJE";
        nikhil.id=114;
        
        vedant.name="VEDANT LANJE";
        vedant.id=110;

        nikhil.printdertail();
        vedant.printdertail();
    }
}
