package ru.mirea.inbo2.pract3;

public class Circle extends Shape {
    double radius;
    Circle (double radius, String color, boolean filled )
    {
        super(color, filled);
        this.radius=radius;
    }
    public double getArea()
    {
        return (Math.PI*radius*radius);
    }
    public double getPerimeter()
    {
        return (Math.PI*2*radius);
    }
    public String toString()
    {
        return (radius + " "+ getArea()+" "+getPerimeter());
    }
    public double getRadius()
    {
        return (radius);
    }
}