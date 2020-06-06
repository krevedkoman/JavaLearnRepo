package main.java.com.krevedkoman.javacore.chapter09;

public class MyIFImp implements MyIF {
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "Another string implementation";
    }
}
