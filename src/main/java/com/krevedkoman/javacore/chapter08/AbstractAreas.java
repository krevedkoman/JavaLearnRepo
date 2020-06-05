package main.java.com.krevedkoman.javacore.chapter08;

import org.w3c.dom.css.Rect;

abstract class Figure1{
    double dim1;
    double dim2;
    Figure1(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}

class Rectangle1 extends Figure1{
    Rectangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("В области четырехугольника.");
        return dim1*dim2;
    }
}

class Triangle1 extends Figure1{
    Triangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("В области трехугольника");
        return dim1 * dim2 / 2;
    }

}


public class AbstractAreas {
    public static void main(String[] args) {

        Rectangle1 r =new Rectangle1(9,5);
        Triangle1 t = new Triangle1(10,8);
        Figure1 figure1;
        figure1 = r;
        System.out.println("Площадь равна " + figure1.area());
        figure1 = t;
        System.out.println("Площадь равна " + figure1.area());

    }
}
