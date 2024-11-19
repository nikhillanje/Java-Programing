class MyEmployee
{
    private int id;
    private String name;
    private double salary;

    String getName()
    {
        return name;
    }
    int getId()
    {
        return id;
    }
    double getSalary()
    {
        return salary;
    }
    void setName(String n)
    {
        name=n;
    }
    void setId(int i)
    {
        id=i;
    }
    void setSalary(double s)
    {
        salary=s;
    }
}

public class Access_modifires {
    public static void main(String[] args) {
        MyEmployee nikhil=new MyEmployee();
        MyEmployee vedant=new MyEmployee();
        
        nikhil.setName("NIKHIL LANJE");
        nikhil.setId(113);
        nikhil.setSalary(120.2);

        vedant.setName("VEDANT LANJE");
        vedant.setId(190);
        vedant.setSalary(140.5);

        System.out.println("Name Is "+nikhil.getName());
        System.out.println("Id Is "+nikhil.getId());
        System.out.println("Salary Is "+nikhil.getSalary());
        System.out.println();
        System.out.println("Name Is "+vedant.getName());
        System.out.println("Id Is "+vedant.getId());
        System.out.println("Salary Is "+vedant.getSalary());

    }
}
