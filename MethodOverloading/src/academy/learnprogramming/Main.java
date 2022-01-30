package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("JC", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(100);
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    // Method overloading can be accomplished with different parameters.
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println(feet + " feet," + inches + " inches," + centimeters + " centimeters");
            return centimeters;
        }

        System.out.println("Invalid feet or inches parameter");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) (inches / 12);
            double remainInches = (int) inches % 12;
            double centimeters = calcFeetAndInchesToCentimeters(feet, remainInches);
            System.out.println(inches + " inches is equivalent to " + centimeters + " centimeters");
            return centimeters;
        }

        System.out.println("Invalid inches parameter");
        return -1;
    }

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    private static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int minutesRemain = minutes % 60;
            String hourZero = hours < 10 ? "0" : "";
            String minuteZero = minutesRemain < 10 ? "0" : "";
            String secondZero = seconds < 10 ? "0" : "";
            return hourZero + hours + "h " + minuteZero + minutesRemain + "m " + secondZero + seconds + "s";
        }

        return INVALID_VALUE_MESSAGE;
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int secondsRemain = seconds % 60;
            return getDurationString(minutes, secondsRemain);
        }

        return INVALID_VALUE_MESSAGE;
    }
}
