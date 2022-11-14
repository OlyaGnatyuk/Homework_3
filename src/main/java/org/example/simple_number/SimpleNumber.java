package org.example.simple_number;

public class SimpleNumber {
    public static void checkIfNumberIsSimple(int number) {
        if (number < 1) {
            System.out.printf("%s is not natural number\n", number);
            return;
        }

        if (number == 1) {
            System.out.println("1 is both not simple and not composite number");
            return;
        }

        boolean detectSimpleNumber = isSimpleNumber(number);
        System.out.printf("Number %s is %ssimple\n", number, detectSimpleNumber ? "" : "not ");
    }

    private static boolean isSimpleNumber(int number) {
        boolean isSimple = true;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }

        return isSimple;
    }
}
