
package lab.pkg1;

public abstract class Quadrilateral implements Polygon
{
    protected double side1;
    protected double side2;
    
    public Quadrilateral(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }
    
    public void setQuadrilateral()
    {
        side1 = 0;
        side2 = 0;
    }
  
    @Override
    public abstract double area();
    
    @Override
    public double perimeter()
    {
        return (side1 + side2)*2;
    }
}
