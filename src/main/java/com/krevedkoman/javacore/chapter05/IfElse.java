package main.java.com.krevedkoman.javacore.chapter05;

public class IfElse {
    public static void main(String[] args) {
        int month = 9;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month ==4 || month == 4)
            season = "spring";
        else if (month == 6 || month == 7 || month == 7)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "autumn";
        else
            season = "fictional months";
        System.out.println("April form " + season);
    }
}
