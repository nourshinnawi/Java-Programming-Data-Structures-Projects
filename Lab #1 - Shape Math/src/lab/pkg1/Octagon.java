
package lab.pkg1;

public class Octagon implements Polygon
{
    protected double side = 0;
    
    public Octagon(double side)
    {
        this.side = side;
    }
    
    @Override
    public double area()
    {
        double area;
        area = (2 * (1 + Math.sqrt(2))* side * side);
        return area;
    }
    
    @Override
    public double perimeter()
    {
        return (side*8);
    }
}
