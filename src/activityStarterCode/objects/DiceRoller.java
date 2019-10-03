package activityStarterCode.objects;

public class DiceRoller {
    public static void main(String[] args) {
        Die dice = new Die(6);
        Die twoDice = new Die(6);

        int sameValueCount = 0;

        /*If we rolled each object and then tested the values for equality (both the int and to toString version)
        *then we receive the final count as 1 million every time.
        *We solved this by creating values to hold the rolled value and then tested those.
        * The reason was the value instance variable in Die was static and that meant every object of that type shared
        * the same value.
        */
        for (int i = 0; i < 1000000; i++) {
            dice.roll();
            twoDice.roll();
            if(dice.getValue() == twoDice.getValue()) {
                sameValueCount++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " +sameValueCount + " time!");



    }
}
