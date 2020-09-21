package ru.mirea.inbo2.pract3;

public class Square extends Rectangle{
    double size;
    public Square(String color, boolean filled, double size) {
        super(size, size, color, filled);
        this.size=size;
    }

    public Square(double size) {
        super(size, size, null, false);
        this.size=size;
    }

    public double getSide()
    {
        return size;
    }
}