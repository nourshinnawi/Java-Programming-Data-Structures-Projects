
package lab.pkg1;

import java.util.Scanner;

public class Lab1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double side1;
        double side2;
        double side3;
        
        System.out.printf("Enter the length of one side of the Triangle: ");
        side1 = input.nextDouble();
        System.out.printf("Enter the length of the other side of the Triangle: ");
        side2 = input.nextDouble();
        System.out.printf("Enter the length of the other side of the Triangle: ");
        side3 = input.nextDouble();
        
        Triangle triangle = new Triangle(side1, side2, side3) {};
        
        try
        {
            System.out.printf("The area of the Triangle is %.2f %n", triangle.area());
            System.out.printf("The perimeter of the Triangle is %.2f %n", triangle.perimeter());
        }
        catch(IllegalArgumentException x)
        {
            System.out.println(x.getMessage());
        }
        
        System.out.printf("%n");
        System.out.printf("Enter the length of the same sides of the Isosceles triangle: ");
        side1 = input.nextDouble();
        System.out.printf("Enter the length of the third side of the Isosceles triangle: ");
        side2 = input.nextDouble();
        
        IsoscelesTriangle IT = new IsoscelesTriangle(side1, side2, side1);
        
        try
        {
            System.out.printf("The area of the Isosceles triangle is %.2f %n", IT.area());
            System.out.printf("The perimeter of the Isosceles triangle is %.2f %n", IT.perimeter());
        }
        catch (IllegalArgumentException x)
        {
            System.out.println(x.getMessage());
        }
        
        System.out.printf("%n");
        System.out.printf("Enter the length for all three sides of the Equilateral triangle: ");
        side1 = input.nextDouble();
        
        EquilateralTriangle ET = new EquilateralTriangle(side1);
        System.out.printf("The area of the Equilateral triangle is %.2f %n", ET.area());
        System.out.printf("The perimeter of the Equilateral triangle is %.2f %n", ET.perimeter());
        
        System.out.printf("%n");
        System.out.printf("Enter the length of one side of the Rectangle: ");
        side1 = input.nextDouble();
        
        System.out.printf("Enter the length of the other side of the Rectangle: ");
        side2 = input.nextDouble();
        
        Rectangle rectangle = new Rectangle(side1, side2);
        System.out.printf("The area of the Rectangle is %.2f %n", rectangle.area());
        System.out.printf("The perimeter of the Rectangle is %.2f %n", rectangle.perimeter());
        
        System.out.printf("%n");
        System.out.printf("Enter the length of the sides of the Square: ");
        side1 = input.nextDouble();
        
        Square square = new Square(side1);
        
        System.out.printf("The area of the Square is %.2f %n", square.area());
        System.out.printf("The perimeter of the Square is %.2f %n", square.perimeter());
        
        System.out.printf("%n");
        System.out.printf("Enter the length of the sides of the Pentagon: ");
        side1 = input.nextDouble();
        
        Pentagon pentagon = new Pentagon(side1);
        System.out.printf("The area of the Pentagon is %.2f %n", pentagon.area());
        System.out.printf("The perimeter of the Pentagon is %.2f %n", pentagon.perimeter());
        
        System.out.printf("%n");
        System.out.printf("Enter the length of the sides of the Hexagon: ");
        side1 = input.nextDouble();
        
        Hexagon hexagon = new Hexagon(side1);
        
        System.out.printf("The area of the Hexagon is %.2f %n", hexagon.area());
        System.out.printf("The perimeter of the Hexagon is %.2f %n", hexagon.perimeter());
        
        System.out.printf("%n");
        System.out.printf("Enter the length of the sides of the Octagon: ");
        side1 = input.nextDouble();
        
        Octagon octagon = new Octagon(side1);
        
        System.out.printf("The area of the Octagon is %.2f %n", octagon.area());
        System.out.printf("The perimeter of the Octagon is %.2f %n", octagon.perimeter());

        System.out.printf("%n");
    }
}
