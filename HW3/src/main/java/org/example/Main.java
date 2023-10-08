package org.example;

public class Main {

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int number) {
        return number > 25 && number < 100;
    }
}