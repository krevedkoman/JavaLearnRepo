package main.java.com.krevedkoman.javacore.chapter09.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Construct of this package");
        System.out.println("n = " + p.n);
        // System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
