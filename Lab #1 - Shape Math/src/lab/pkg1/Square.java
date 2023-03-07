
package lab.pkg1;

public class Square extends Quadrilateral
{
    public Square()
    {
        super(0,0);
    }
    
    public Square(double side)
    {
        super(side, side);
    }
    
    @Override
    public double area()
    {
        return (side1*side1);
    }
}
