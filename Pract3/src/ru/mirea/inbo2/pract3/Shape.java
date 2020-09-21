package ru.mirea.inbo2.pract3;

public abstract class Shape {
    String color;
    boolean filled;
    public Shape(String color, boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String colour)
    {
        this.color=colour;
    }
    public String getColor()
    {
        return color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    @Override
    abstract public String toString();

}