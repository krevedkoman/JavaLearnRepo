package main.java.com.krevedkoman.javacore.tictactoe;

public class Field {
    private String [] fieldArray = {"1","2","3","4","5","6","7","8","9" };

    public String[] getFieldArray() {
        return fieldArray;
    }


    public void setFieldArray(String[] fieldArray) {
        this.fieldArray = fieldArray;
    }

    void screen() {
        int i = 0;
        for (int b = 0; b < 3; b++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(fieldArray[i] + "  ");
                i++;
            }
            System.out.println();
        }
    }

}
