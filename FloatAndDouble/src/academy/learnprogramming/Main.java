package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 32 bits/width
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value " + myMinFloatValue);
        System.out.println("Float maximum value " + myMaxFloatValue);

        // 64 bits/width
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value " + myMinDoubleValue);
        System.out.println("Double maximum value " + myMaxDoubleValue);
        
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double myPounds = 200d;
        double myKilograms = myPounds * 0.45359237d;
        System.out.println("Converted kilograms =  " + myKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        // Double is more precise than float and faster too. BigDecimal class is usually used for precise calculations.
    }
}
