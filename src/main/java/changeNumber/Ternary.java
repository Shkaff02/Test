package changeNumber;

import java.util.Random;

public class Ternary {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(1, 3);
        System.out.println("Original number: " + i);
        int result = i == 1 ? 2 : 1;
        i = result;
        System.out.println("Changed number: " + i);
    }
}
