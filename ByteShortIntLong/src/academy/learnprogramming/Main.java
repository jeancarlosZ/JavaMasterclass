package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // Width is 32.
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        // Width is 8.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByteValue);
        System.out.println("Byte Maximum Value " + myMaxByteValue);

        // Width is 16.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShortValue);
        System.out.println("Short Maximum Value " + myMaxShortValue);

        // Width is 64.
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLongValue);
        System.out.println("Long Maximum Value " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // Casting is converting a value to a certain type with a set of parenthesis with the desired type inside.
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Java treats numbers as integers by default.

        byte newByte = 10;
        short newShort = 20;
        int newInt = 50;
        long newLong = 50000 + 10 * (newByte + newShort + newInt);
        System.out.println(newLong);

        // Casting is needed when integer' max width exceeds the type's maximum width.
        short shortTotal = (short) (1000 + 10 *
                (newByte + newShort + newInt));
        System.out.println(shortTotal);
    }
}
