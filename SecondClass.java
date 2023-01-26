public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Nwabachili Okey");
        String StringValue = "Hello";
        String StringSecondValue = "World";
        System.out.println("StringNewValue = " + StringValue + StringSecondValue);
        System.out.println("Hello, Tim");

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Michael", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Michael", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Michael", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Michael", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Michael", highScorePosition);
    }

    public static void displayHighScorePosition (String playersName, int highScorePosition) {
            System.out.println(playersName + " managed to get into position " +
                    highScorePosition + " on the high score list ");
    }

    public static int calculateHighScorePosition (int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
