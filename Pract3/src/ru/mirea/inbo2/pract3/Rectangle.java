package ru.mirea.inbo2.pract3;

public class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.length=length;
        this.width=width;
    }

    public double getArea()
    {
        return (width*length);
    }
    public double getPerimeter()
    {
        return (2*(width+length));
    }
    public String toString()
    {
        return (width+" "+length+" "+getArea()+" "+getPerimeter());
    }
    public double getLength()
    {
        return length;
    }
}