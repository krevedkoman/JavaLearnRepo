package main.java.com.krevedkoman.javacore.chapter07;
class Test01{
    int a;
    public int b;
    private int c;
    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Test01 ob = new Test01();
        ob.a = 10;
        ob.b = 20;
        // ob.c = 100; // Error because variable 'c' have access as private.

        ob.setc(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
