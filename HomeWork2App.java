class HomeWork2App {
    public static void main(String[] args) {
        compareSumAndReturnBoolean(4, 17);
        checkNumberAndPrintValue(-2);
        returnBooleanValueOfNumber(0);
        printStringRepeatedly("test", 2);
        determineLeapYearAndReturnBoolean(2021);
    }

    static boolean compareSumAndReturnBoolean(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void checkNumberAndPrintValue(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean returnBooleanValueOfNumber(int a) {
        if (a > 0) {
            return false;
        }
        return true;
    }

    static void printStringRepeatedly(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }

    static boolean determineLeapYearAndReturnBoolean(int a) {
        if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) {
            return true;
        }
        return false;
    }
}