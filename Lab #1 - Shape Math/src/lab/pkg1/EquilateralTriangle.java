
package lab.pkg1;

public class EquilateralTriangle extends Triangle
{
    public EquilateralTriangle()
    {
        super(0,0,0);
    }
    
    public EquilateralTriangle(double side1)
    {
        super(side1,side1,side1);
    }
    
    @Override
    public double area()
    {
        double area;
        area = (Math.sqrt(3)/4)*(side1*side1);
        return area;
    }
}
