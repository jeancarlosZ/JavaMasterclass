package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // A char '' stores only one character in contrast to literal string "" that can store more than one character.
        // A char occupies two bytes of memory or 16 bits because it allows Unicode characters, up to 65535 different characters.
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // A boolean value allows for two choices True (Yes, 1) OR False (No, 0).
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
