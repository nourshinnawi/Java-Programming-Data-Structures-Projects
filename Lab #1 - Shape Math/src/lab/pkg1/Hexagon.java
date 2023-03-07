
package lab.pkg1;

public class Hexagon implements Polygon
{
    protected double side = 0;
    
    public Hexagon(double side)
    {
        this.side = side;
    }
    
    @Override
    public double area()
    {
        double area;
        area = ((3 * Math.sqrt(3)*(side*side))/2);
        return area;
    }
    
    @Override
    public double perimeter()
    {
        return (side * 6);
    }
}
