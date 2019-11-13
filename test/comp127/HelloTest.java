package comp127;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {
//    @Test
//    public void helloTest() {
//        assertEquals(2, 1 + 1);
//    }


    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 9999, 5, 10, 7, 8};

        //public int findMax(int[] array) {
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
            System.out.println(max);
        }
        System.out.println("max: " + max);
    }
}

