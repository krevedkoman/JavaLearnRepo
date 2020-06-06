package main.java.com.krevedkoman.javacore.chapter09;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds;
        for (int i=0; i<12;i++) mystack.push(i);

        mystack = fs;
        for (int i=0; i<8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Dynamic stack: ");
        for (int i=0; i<12;i++) System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Fixed stack: ");
        for (int i=0; i<8;i++) System.out.println(mystack.pop());
        fs.clear(); // implement UnsupportedOperationException
    }
}
