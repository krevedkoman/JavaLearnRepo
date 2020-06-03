package main.java.com.krevedkoman.javacore.chapter06;

class Box4{
    double width;
    double height;
    double depth;

    double volume(){
        return width * height * depth;
    }
}
public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // Первый вариант примера

        /*vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
        */

        // Оптимаоьный вариант

        System.out.println("Объем равен " + mybox1.volume());
        System.out.println("Объем равен " + mybox2.volume());

    }
}
