
package lab.pkg1;

public class IsoscelesTriangle extends Triangle
{
    public IsoscelesTriangle()
    {
        super(0,0,0);
    }
    
    public IsoscelesTriangle(double side1, double side2, double side3)
    {
        super(side1,side2,side3);
    }
    
    @Override
    public double area()
    {
        double area;
        if(side2 == side1)
        {
            throw new IllegalArgumentException("This side cannot be identical to the others.");
        }
        else
        {
            area = ((side2/4)*Math.sqrt((4*side1*side1)-(side2*side2)));
            return area;
        }
    }
}
