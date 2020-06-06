package main.java.com.krevedkoman.javacore.chapter09;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Default object string type";
    }
}
