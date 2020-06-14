package main.java.com.krevedkoman.javacore.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    final String alreadyUsedErr = "This field is already used, please select another field";
    final String enterOnlyOneDigit = "You must enter only one digit";
    final String doNotEnterLetter = "Do not enter letter, enter only one digit";



    Field field = new Field();
    void start(){
        do {
            screen(field.getMyarray());
            input();
            npcRandomStep();
            if(chkWinner(field.getMyarray()) != "") {

                System.out.println("Winner: " + chkWinner(field.getMyarray()));

                break;
            }

        }
        while (true);
    }

    public void screen(String [] myarray) {
        int i = 0;
        for (int b = 0; b < 3; b++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(myarray[i] + "  ");
                i++;
            }
            System.out.println();
        }
    }



        void npcRandomStep(){
        int counterVal = 0;
        Random random = new Random();
        int min = 1, max = 9;
        int fieldValue;
        do {
            fieldValue = random.nextInt(max - min + 1) + min;
            fieldValue = fieldValue - 1;
            if (field.getMyarray()[fieldValue].equals("X") || field.getMyarray()[fieldValue].equals("O") )
            {

            }
            else {
                field.getMyarray()[fieldValue] = "O";
                counterVal = 1;
            }
        } while (counterVal < 1);


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
                    if (field.getMyarray()[num].equals("X") || field.getMyarray()[num].equals("O") )
                    {
                        System.out.println(alreadyUsedErr);
                    }
                    else {
                        field.getMyarray()[num] = "X";
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
