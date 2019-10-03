package activityStarterCode.objects;

import java.util.Random;

//jgu1@mac
//lcraveir@mac

public class Die {
    private int value = -1;
    private int sides = 0;

    public Die(int diceSides) {
        sides = diceSides;
    }

    static Random rand = new Random();

    public void roll() {
         value = rand.nextInt(5) +1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == 1) {
            return "one";
        } else if (value == 2){
            return "two";
        } else if (value == 3) {
            return "three";
        } else if (value == 4) {
            return "four";
        } else if (value == 5) {
            return "five";
        } else if (value == 6) {
            return "six";
        }
        else {
            return "The die has not been rolled.";
        }
    }
}
