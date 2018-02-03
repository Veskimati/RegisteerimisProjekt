package sample;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelector {

    private RandomSelector(){}

    public static int select(int size){
        Random random = new Random();
        int randIndex;

        if(size > 1) {
            randIndex = random.nextInt(size - 1);
        }else{
            randIndex = 0;
        }

        return randIndex;
    }
}
