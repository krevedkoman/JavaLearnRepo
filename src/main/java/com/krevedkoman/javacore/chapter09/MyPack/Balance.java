package main.java.com.krevedkoman.javacore.chapter09.MyPack;

public class Balance {
    String name;
    double bal;
    public Balance(String n, double b){
        name = n;
        bal = b;

    }
    public void show(){
        if (bal<0)
            System.out.print("---> ");
        System.out.println(name + ": $" + bal);
    }
}
