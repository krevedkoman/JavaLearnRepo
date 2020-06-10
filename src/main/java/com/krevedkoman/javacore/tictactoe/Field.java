package main.java.com.krevedkoman.javacore.tictactoe;

public class Field {

    public void screen(String [] myarray){
        int i = 0;
        for (int b = 0;b<3; b++ ){
            for (int c =0; c < 3; c++){
                System.out.print(myarray[i] + "  ");
                i++;
            }
            System.out.println();
        }

    }
}
