package main.java.com.krevedkoman.javacore.chapter09;

import java.util.Random;

public class Questions implements SharedConstants {
    Random random = new Random();
    int ask(){
        int prob = (int) (100 * random.nextDouble());
        if(prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 75)
            return LATER;
        else if (prob<98)
            return SOON;
        else return NEVER;
    }

}
