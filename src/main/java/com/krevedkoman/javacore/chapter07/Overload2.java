package main.java.com.krevedkoman.javacore.chapter07;
class OverloadDemo2{
    void test(){
        System.out.println("Параметры отсутствуют");
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

public class Overload2 {
    public static void main(String[] args) {
    int i = 88;
    OverloadDemo2 overloadDemo2 = new OverloadDemo2();

    overloadDemo2.test();
    overloadDemo2.test(10,20);
    overloadDemo2.test(i);
    overloadDemo2.test(123.2);

    }
}
