package ait.figure.model;

public class Circle extends Shape{

    public Circle(double side) {
        super(side);
    }

    public double calcArea(){
        return Math.pow(side, 2);
    }

    public double calcPerimeter(){
        return 4 * side;
    }
}
