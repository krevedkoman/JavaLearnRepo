package main.java.com.krevedkoman.javacore.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    private String [] myarray = {"1","2","3","4","5","6","7","8","9" };
    Field field = new Field();
    void start(){
        do {
            field.screen(myarray);
            input();
            npcRandomStep();
            if(chkWinner(myarray) != "") {
                field.screen(myarray);
                System.out.println("Winner: " + chkWinner(myarray));

                break;
            }

        }
        while (true);
    }


    void npcRandomStep(){
        int val = 0;
        Random random = new Random();
        int min = 1, max = 9;
        int i;
        do {
            i = random.nextInt(max - min + 1) + min;
            i = i - 1;
            if (myarray[i].equals("X") || myarray[i].equals("O") )
            {

            }
            else {
                myarray[i] = "O";
                val = 1;
            }
        //    return "";
        } while (val < 1);


    }


    String chkWinner(String [] myarray){

        if (myarray[0] == "X" && myarray[1] == "X" && myarray[2] == "X")
            return "X";
        if (myarray[3] == "X" && myarray[4] == "X" && myarray[5] == "X")
            return "X";
        if (myarray[6] == "X" && myarray[7] == "X" && myarray[8] == "X")
            return "X";
        if (myarray[0] == "X" && myarray[3] == "X" && myarray[6] == "X")
            return "X";
        if (myarray[1] == "X" && myarray[4] == "X" && myarray[7] == "X")
            return "X";
        if (myarray[2] == "X" && myarray[5] == "X" && myarray[8] == "X")
            return "X";
        if (myarray[0] == "X" && myarray[4] == "X" && myarray[8] == "X")
            return "X";
        if (myarray[2] == "X" && myarray[4] == "X" && myarray[6] == "X")
            return "X";

        if (myarray[0] == "O" && myarray[1] == "O" && myarray[2] == "O")
            return "O";
        if (myarray[3] == "O" && myarray[4] == "O" && myarray[5] == "O")
            return "O";
        if (myarray[6] == "O" && myarray[7] == "O" && myarray[8] == "O")
            return "O";
        if (myarray[0] == "O" && myarray[3] == "O" && myarray[6] == "O")
            return "O";
        if (myarray[1] == "O" && myarray[4] == "O" && myarray[7] == "O")
            return "O";
        if (myarray[2] == "O" && myarray[5] == "O" && myarray[8] == "O")
            return "O";
        if (myarray[0] == "O" && myarray[4] == "O" && myarray[8] == "O")
            return "O";
        if (myarray[2] == "O" && myarray[4] == "O" && myarray[6] == "O")
            return "O";
        return "";

    }

    void input(){
        int val = 0;
        System.out.println("Enter you value");
        do {
            Scanner scanner = new Scanner(System.in);
            String character = scanner.next();
            char myChar = character.charAt(0);

            if (Character.isDigit(myChar))
            {
                int num = Character.getNumericValue(myChar);

                if (num >= 1 && num < 10)
                {
                    num = num -1;
                    if (myarray[num].equals("X") || myarray[num].equals("O") )
                    {
                        System.out.println("This field is already used, please select another field");
                    }
                    else {
                        myarray[num] = "X";
                        val = 1;
                    }

                }
                else System.out.println("Enter correct value");

            }
            else System.out.println("Enter correct value");

        } while (val < 1);
    }


    boolean validateInput(){

        return false;
    }

}
