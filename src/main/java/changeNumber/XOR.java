/*
С помощью операции побитовой операции XOR(менят бит в случае двух разных):
    1) Если i = 1
        0 1
        XOR
        1 1
        RESULT
        1 0

    2) Если i = 2
        1 0
        XOR
        1 1
        RESULT
        0 1

*/
package changeNumber;

import java.util.Random;

public class XOR {
        public static void main(String[] args) {
            Random random = new Random();
            int i = random.nextInt(1, 3);
            System.out.println("Original number: " + i);
            System.out.println("Changed number: " + (i ^ 3));
        }
}
