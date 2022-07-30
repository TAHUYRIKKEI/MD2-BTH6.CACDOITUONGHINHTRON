package Rikkeiacademy;

import Rikkeiacademy.Shape;

public class Main {
    public static void main(String[] args) {
//        kiem thu class shape
        System.out.println("----SHAPE----");

        Shape shape = new Shape();
        System.out.println(shape);


        shape = new Shape("red", false);
        System.out.println(shape);

//        kiem thu Class Circle
        System.out.println("------CIRCLE-----");

        Circle circle = new Circle();
        System.out.println(circle);


        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "ndigo", false);
        System.out.println(circle);
//        kiem thu Class Rectangle
        System.out.println("----RECTANGLE-----");
        Retangle retangle = new Retangle();
        System.out.println(retangle);


        retangle = new Retangle(2.3, 5.8);
        System.out.println(retangle);
        retangle = new Retangle(2.5 , 3.8);
        System.out.println(retangle);
//        kiem tra square
        System.out.println("----SQUARE----");
        Square square = new Square();
        System.out.println(square);


        square =new Square(2.3);
        System.out.println(square);
        square  = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
