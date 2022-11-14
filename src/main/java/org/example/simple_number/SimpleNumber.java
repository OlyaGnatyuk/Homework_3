package org.example.simple_number;

public class SimpleNumber {
    public static void checkIfNumberIsSimple(int number) {
        boolean detectSimpleNumber = isSimpleNumber(number);
        System.out.printf("Number %s is %ssimple%n", number, detectSimpleNumber ? "" : "not ");
    }

    private static boolean isSimpleNumber(int number) {
        if (number < 2) {
            return false;
        }

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
