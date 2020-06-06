package main.java.com.krevedkoman.javacore.chapter09;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear(){
        throw new UnsupportedOperationException();
       // System.out.println(e.UnsupportedOperationException);
    }
}
