package main.java.com.krevedkoman.javacore.chapter09;

public class Client implements Callback {
    public void callback(int p){
        System.out.println("Methon callback(), called by " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Non interface method");
    }
}
