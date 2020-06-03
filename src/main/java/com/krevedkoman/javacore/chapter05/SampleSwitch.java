package main.java.com.krevedkoman.javacore.chapter05;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i){
                case 0:
                    System.out.println("i equally 0");
                    break;
                case 1:
                    System.out.println("i equally 1");
                    break;
                case 2:
                    System.out.println("i equally 2");
                    break;
                case 3:
                    System.out.println("i equally 3");
                    break;
                default:
                    System.out.println("i more 3");

            }
    }
}
