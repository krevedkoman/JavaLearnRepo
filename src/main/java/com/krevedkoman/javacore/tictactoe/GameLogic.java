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
            field.screen();
            input();
            if(chkWinner(field.getFieldArray()) != "") {
                field.screen();
                System.out.println("Winner: " + chkWinner(field.getFieldArray()));
                break;
            }
            npcRandomStep();
            if(chkWinner(field.getFieldArray()) != "") {
                field.screen();
                System.out.println("Winner: " + chkWinner(field.getFieldArray()));
                break;
            }
        }
        while (true);
    }

        void npcRandomStep(){
        int counterVal = 0;
        Random random = new Random();
        int min = 1, max = 9;
        int fieldValue;
        do {
            fieldValue = random.nextInt(max - min + 1) + min;
            fieldValue = fieldValue - 1;
            if (field.getFieldArray()[fieldValue].equals("X") || field.getFieldArray()[fieldValue].equals("O") )
            {

            }
            else {
                field.getFieldArray()[fieldValue] = "O";
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
                if (field.getFieldArray()[num].equals("X") || field.getFieldArray()[num].equals("O")) {
                    System.out.println(alreadyUsedErr);
                } else {
                    field.getFieldArray()[num] = "X";
                    val = 1;
                }

            }
        }

            while (val < 1) ;
        }


    boolean validateInput(char checkInputCharValue) {

        if (!Character.isDigit(checkInputCharValue)) {
            System.out.println(doNotEnterLetter);
            return false;
        }

            int num = Character.getNumericValue(checkInputCharValue);
            if (num >= 1 && num < 10) {
                return true;
            } else {
                System.out.println(enterOnlyOneDigit);
                return false;

            }

        }

}
