class Cylinder
{
    private int radius;
    private int height;

    int getRadius()
    {
        return radius;
    }
    void setRadius(int r)
    {
        radius=r;
    }
    int getHeight()
    {

        return height;

    }
    void setHeight(int h)
    {
        height=h;
    }
}


public class Getters_and_Setters {
    public static void main(String[] args) {
        Cylinder mCylinder=new Cylinder();

        mCylinder.setHeight(12);
        int hyt=mCylinder.getHeight();

        System.out.println("Height is "+hyt);

        mCylinder.setRadius(9);
        int ryd=mCylinder.getRadius();

        System.out.println("Radius is "+ryd);
    }
    
}
