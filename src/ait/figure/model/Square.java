package ait.figure.model;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    public double calcArea(){
        return Math.pow(side, 2);
    }

    public double calcPerimeter(){
        return side * 4;
    }
}
