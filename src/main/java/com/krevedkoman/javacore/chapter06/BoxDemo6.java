package main.java.com.krevedkoman.javacore.chapter06;

class Box6{
    double width;
    double height;
    double depth;

    Box6(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width * height * depth;
    }

}
public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        System.out.println("Объем равен " + mybox1.volume());
        System.out.println("Объем равен " + mybox2.volume());

    }
}
