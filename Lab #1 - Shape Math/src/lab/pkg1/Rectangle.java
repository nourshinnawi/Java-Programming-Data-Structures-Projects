
package lab.pkg1;

public class Rectangle extends Quadrilateral
{
    public Rectangle()
    {
        super(0,0);
    }
    
    public Rectangle(double side1, double side2)
    {
        super(side1, side2);
    }
    
    @Override
    public double area()
    {
        return side1*side2;
    }
}
