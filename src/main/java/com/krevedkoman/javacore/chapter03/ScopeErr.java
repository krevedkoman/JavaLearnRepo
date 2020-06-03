package main.java.com.krevedkoman.javacore.chapter03;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 2;
        }
    }
}
