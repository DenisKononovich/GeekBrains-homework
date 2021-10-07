/**
 * Java 1. Homework 2
 *
 * @author Denis Kononovich
 * @version 07.10.21
 */

class HomeWork2App {
    public static void main(String[] args) {
        checkSumInIntervalAndReturnBoolean(4, 17);
        checkNumberAndPrintValue(-2);
        returnBooleanValueOfNumber(0);
        printStringRepeatedly("test", 2);
        determineLeapYearAndReturnBoolean(2021);
    }

    static boolean checkSumInIntervalAndReturnBoolean(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void checkNumberAndPrintValue(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    static boolean returnBooleanValueOfNumber(int a) {
        return a <= 0;
    }

    static void printStringRepeatedly(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    static boolean determineLeapYearAndReturnBoolean(int a) {
        return (a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0));
    }
}