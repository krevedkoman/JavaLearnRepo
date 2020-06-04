package main.java.com.krevedkoman.javacore.chapter07;

class OverloadDemo{
    void test(){
        System.out.println("Параметры отсутствуют");
    }
    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b );
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }

}
public class Overload {
    public static void main(String[] args) {


        OverloadDemo overloadDemo = new OverloadDemo();
        double result;
        overloadDemo.test();
        overloadDemo.test(10);
        overloadDemo.test(10,20);
        System.out.println("Вывод результата вызова overloadDemo.test(123.25): " + (result = overloadDemo.test(123.25)));
   }
}
