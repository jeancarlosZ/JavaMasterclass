package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 6;

        while(count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for(int i = 6; i != 6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            count++;
            System.out.println("Even number " + number);
            if (count >= 5) {
                break;
            }
        }

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        }

        return false;
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
