package main.java.com.krevedkoman.javacore.chapter08;
class A2{
    int i;
}

class B2 extends A2{
    int i;
    B2(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("Member i in superclass: " + super.i);
        System.out.println("Member i in subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B2 subOb = new B2(1,2);
        subOb.show();
    }
}