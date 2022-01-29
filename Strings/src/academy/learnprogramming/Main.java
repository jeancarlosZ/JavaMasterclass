package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // 8 primitive data types:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // A String is a sequence of characters and a Class. It's limited by memory or MAX_VALUE of an int which is 2.14 Billion.
        // Strings are immutable so a new String is created as the old one is discarded.
        // StringBuffer is an efficient way to append values.

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
