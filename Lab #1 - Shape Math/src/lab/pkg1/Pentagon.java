
package lab.pkg1;

public class Pentagon implements Polygon
{
    protected double side = 0;
    
    public Pentagon(double side)
    {
        this.side = side;
    }
    
    @Override
    public double area()
    {
       double area = (Math.sqrt((5 * (5 + 2 * Math.sqrt(5))))* side * side)/4;
       return area;
    }
    
    @Override
    public double perimeter()
    {
        return (side*5);
    }
}
