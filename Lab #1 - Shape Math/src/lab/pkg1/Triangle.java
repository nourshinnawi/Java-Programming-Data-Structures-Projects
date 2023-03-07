
package lab.pkg1;

public abstract class Triangle implements Polygon
{
    protected double side1;
    protected double side2;
    protected double side3;
    
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public void setTriangle()
    {
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }
    
    @Override
    public double area()
    {
        if ((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1)
        {
            double num;
            double area;
            num = (side1+side2+side3)/2;
            area = Math.sqrt(num*(num-side1)*(num-side2)*(num-side3));
            return area;
        }
        else
        {
            throw new IllegalArgumentException("Those numbers are not valid.");
        }
    }
    
    @Override
    public double perimeter()
    {
        return (side1 + side2 + side3);
    }
}
