package main.java.com.krevedkoman.javacore.chapter08;

abstract  class A7{
    abstract void callme();

    void callmetoo(){
        System.out.println("Это конкретный метод.");
    }
}

class B7 extends A7{
    void callme(){
        System.out.println("Реализация метода callme() в классе B7");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B7 b7 = new B7();
        b7.callme();
        b7.callmetoo();
    }
}
