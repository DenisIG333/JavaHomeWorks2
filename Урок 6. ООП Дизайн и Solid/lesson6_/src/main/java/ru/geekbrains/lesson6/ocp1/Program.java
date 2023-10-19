package ru.geekbrains.lesson6.ocp1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<ShapeV2> shapes = new ArrayList<>();
        shapes.add(new RightTriangleV2(2, 3));
        shapes.add(new CircleV2(10));
        shapes.add(new SquareV2(4));
        double sumArea = 0;
        for (ShapeV2 shape : shapes){
            sumArea += shape.getArea();
        }
        System.out.printf("Сумма площадей фигур равна %.2f \n", sumArea);

        /*List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Circle(10));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes){
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }
        }
        System.out.printf("Сумма площадей фигур равна %.2f \n", sumArea);*/
    }

}
