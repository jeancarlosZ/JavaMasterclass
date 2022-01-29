package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; // The whole code line is a Java statement.
        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one"); // It works, but not recommended having everything on same line.

        // Whitespace is best for readability and separating data type from name of variable.

        // Indentation is best for readability.
    }
}
