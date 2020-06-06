package main.java.com.krevedkoman.javacore.chapter09.p2;

public class OtherPackage {
    OtherPackage(){
        main.java.com.krevedkoman.javacore.chapter09.p1.Protection p = new main.java.com.krevedkoman.javacore.chapter09.p1.Protection();
        System.out.println("n_pub = " + p.n_pub);
    }
}
