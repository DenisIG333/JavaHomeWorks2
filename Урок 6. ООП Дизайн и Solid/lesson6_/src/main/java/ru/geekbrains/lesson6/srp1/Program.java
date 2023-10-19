package ru.geekbrains.lesson6.srp1;

public class Program {

    public static void main(String[] args) {
        //Square square = new Square(new Point(1, 1), 10);
        //System.out.println("Площадь фигуры: " + square.getArea());
        //square.draw();

        SquareV2 squareV2 = new SquareV2(new Point(1,1), 5);
        System.out.println("Площадь фигуры: " + squareV2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(squareV2, 2);
        squareDrawer.draw();
        squareDrawer.setScale(3);
        squareDrawer.draw();
    }

}
