package main.java.com.krevedkoman.javacore.chapter08;

import javax.sound.midi.Soundbank;

class A3{
    A3(){
        System.out.println("In constructor A3.");
    }
}

class B3 extends A3{
    B3(){
        System.out.println("In constructor B3");
    }
}

class C3 extends B3{
    C3(){
        System.out.println("In constructor C3");
    }

}


public class CallingCons {
    public static void main(String[] args) {
        C3 c3 = new C3();
    }
}
