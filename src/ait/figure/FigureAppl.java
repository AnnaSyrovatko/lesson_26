package ait.figure;

import ait.figure.model.Circle;
import ait.figure.model.Shape;
import ait.figure.model.Square;
import ait.figure.model.Triangle;

import java.util.Arrays;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes= {
                new Circle(5),
                new Circle(10),
                new Triangle(5),
                new Square(10)
        };

        double total = totalArea(shapes);
        System.out.printf("Total area of all figures %.2f", total);
        total = totalPerimeter(shapes);
        System.out.printf("\nTotal perimeter of all figures %.2f", total);

        double sum = 0;

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle circleA = (Circle) shapes[i];
                sum += circleA.calcArea();
            }
        }
        System.out.printf("\nTotal area of all circles %.2f", + sum);
    }

    public static double totalArea(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
             sum += shapes[i].calcArea();
        }
        return sum;
    }
    public static double totalPerimeter(Shape[] shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            sum += shapes[i].calcPerimeter();
        }
        return sum;
    }
}
