class MyEmployee
{
    private int id;
    private String name;
    private double salary;

    MyEmployee()
    {
        id=45;
        name="NIKHIL LANJE";
        salary=12.5;
    }

    String getName()
    {
        return name;
    }
    void setName(String n)
    {
     name=n;
    }

    int getId()
    {
        return id;
    }
    void setId(int i)
    {
        id=i;
    }
    double getsalary()
    {
        return salary;
    }
    void setSalary(double s)
    {
        salary=s;
    }
}

public class Constructur_in_java {
    public static void main(String[] args) {
        MyEmployee nikhil=new MyEmployee();

        System.out.println("My Name Is "+nikhil.getName());
        System.out.println("My Id Is "+nikhil.getId());
        System.out.println("My Salary Is "+nikhil.getsalary());
    }
    
}
