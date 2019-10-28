package randomNumberGenerator;

import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int input;
        int num1;

        System.out.println("Enter a number: ");
        Scanner s = new Scanner(System.in);
        Random g = new Random();

        input = s.nextInt();
        num1 = g.nextInt(input);
        System.out.println(num1);
    }
}
