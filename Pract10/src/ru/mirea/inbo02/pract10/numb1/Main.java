package ru.mirea.inbo02.pract10.numb1;

interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}

class ConcreteComplex implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}

class Complex {
    private int real;
    private int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public Complex() { }
}