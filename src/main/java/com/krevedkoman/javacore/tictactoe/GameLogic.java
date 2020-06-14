package main.java.com.krevedkoman.javacore.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    final String alreadyUsedErr = "This field is already used, please select another field";
    final String enterOnlyOneDigit = "You must enter a number from 1 to 9, cannot enter zero";
    final String doNotEnterLetter = "Do not enter letter, enter only one digit";

    Field field = new Field();
    void start(){
        do {
            screen(field.getMyarray());
            input();
            if(chkWinner(field.getMyarray()) != "") {
                screen(field.getMyarray());
                System.out.println("Winner: " + chkWinner(field.getMyarray()));
                break;
            }
            npcRandomStep();
            if(chkWinner(field.getMyarray()) != "") {
                screen(field.getMyarray());
                System.out.println("Winner: " + chkWinner(field.getMyarray()));
                break;
            }
        }
        while (true);
    }



    void screen(String [] fieldArray) {
        int i = 0;
        for (int b = 0; b < 3; b++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(fieldArray[i] + "  ");
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


    String chkWinner(String [] filedArray){

        if (filedArray[0] == "X" && filedArray[1] == "X" && filedArray[2] == "X")
            return "X";
        if (filedArray[3] == "X" && filedArray[4] == "X" && filedArray[5] == "X")
            return "X";
        if (filedArray[6] == "X" && filedArray[7] == "X" && filedArray[8] == "X")
            return "X";
        if (filedArray[0] == "X" && filedArray[3] == "X" && filedArray[6] == "X")
            return "X";
        if (filedArray[1] == "X" && filedArray[4] == "X" && filedArray[7] == "X")
            return "X";
        if (filedArray[2] == "X" && filedArray[5] == "X" && filedArray[8] == "X")
            return "X";
        if (filedArray[0] == "X" && filedArray[4] == "X" && filedArray[8] == "X")
            return "X";
        if (filedArray[2] == "X" && filedArray[4] == "X" && filedArray[6] == "X")
            return "X";

        if (filedArray[0] == "O" && filedArray[1] == "O" && filedArray[2] == "O")
            return "O";
        if (filedArray[3] == "O" && filedArray[4] == "O" && filedArray[5] == "O")
            return "O";
        if (filedArray[6] == "O" && filedArray[7] == "O" && filedArray[8] == "O")
            return "O";
        if (filedArray[0] == "O" && filedArray[3] == "O" && filedArray[6] == "O")
            return "O";
        if (filedArray[1] == "O" && filedArray[4] == "O" && filedArray[7] == "O")
            return "O";
        if (filedArray[2] == "O" && filedArray[5] == "O" && filedArray[8] == "O")
            return "O";
        if (filedArray[0] == "O" && filedArray[4] == "O" && filedArray[8] == "O")
            return "O";
        if (filedArray[2] == "O" && filedArray[4] == "O" && filedArray[6] == "O")
            return "O";
        return "";

    }

    void input() {
        int val = 0;
        System.out.println("Enter you value");
        do {
            Scanner scanner = new Scanner(System.in);
            String enteredValue = scanner.nextLine();
            char enterDigit = enteredValue.charAt(0);

            if (validateInput(enterDigit)) {
                int num = Character.getNumericValue(enterDigit);
                num = num - 1;
                if (field.getMyarray()[num].equals("X") || field.getMyarray()[num].equals("O")) {
                    System.out.println(alreadyUsedErr);
                } else {
                    field.getMyarray()[num] = "X";
                    val = 1;
                }

            }
        }

            while (val < 1) ;
        }


    boolean validateInput(char checkInputCharValue) {

        if (Character.isDigit(checkInputCharValue)) {
            int num = Character.getNumericValue(checkInputCharValue);
            if (num >= 1 && num < 10) {
                return true;
            } else {
                System.out.println(enterOnlyOneDigit);
                return false;

            }

        } else {
            System.out.println(doNotEnterLetter);
            return false;
        }


    }

}
