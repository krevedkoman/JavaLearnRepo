package main.java.com.krevedkoman.javacore.chapter07;

import javax.sound.midi.Soundbank;

class Stack02{
    private int stck[];
    private int tos;

    Stack02(int size){
        stck = new int[size];
        tos = -1;
    }

    void push(int item){
        if (tos==stck.length-1)
            System.out.println("Stack full");
        else
            stck[++tos] = item;
    }

    int pop(){
        if (tos < 0) {
            System.out.println("Stack not loaded");
            return 0;
        }
        else
            return stck[tos--];
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack02 mystack1 = new Stack02(5);
        Stack02 mystack2 = new Stack02(8);

        for (int i=0; i<5; i++) mystack1.push(i);
        for (int i=0; i<8; i++) mystack2.push(i);

        System.out.println("Stack on mystack1:");
        for (int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack on mystack2:");
        for (int i=0; i<8;i++)
            System.out.println(mystack2.pop());
    }
}
