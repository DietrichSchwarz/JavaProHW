package hm6;

public class HMW6 {
    public static void main(String[] args) {
        printWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkNumbers(2, 8);
        checkNumber(67);
        System.out.println("------");
        checkNegativeNumber(-43);
        printWordsManyTimes("Java Pro", 10);
        yearIsLeap(2043);


    }

    public static void printWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Summ is positive");
        } else
            System.out.println("Summ is negative");
    }

    public static void printColor() {
        int value = 52;
        if (value <= 0) {
            System.out.println("RED");
        } else if (value > 0 && value <= 100) {
            System.out.println("YELLOW");
        } else
            System.out.println("GREEN");
    }

    public static void compareNumbers() {
        int a = 3;
        int d = 7;
        if (a >= d) {
            System.out.println("a >= d ");
        } else {
            System.out.println("a < d");
        }


    }

    public static boolean checkNumbers(int a, int b) {
        int summ = a + b;
        if (summ > 10 && summ < 20) {
            return true;
        } else
            return false;
    }


    public static void checkNumber(int value) {
        if (value >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean checkNegativeNumber(int value) {
        if (value <= 0) {
            return true;
        } else
            return false;
    }

    public static void printWordsManyTimes(String word, int t) {

        for (int n = 1; n <= t; n++) {
            System.out.println(word);
        }

    }

    public static boolean yearIsLeap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("True");
            return true;
        } else
            System.out.println("False");
        return false;
    }
}
