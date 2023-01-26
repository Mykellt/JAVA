public class Challenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Michael", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Kelvin", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Stephen", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Patrick", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("", highScorePosition);
    }

    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(playersName + " managed to get into position " +
                highScorePosition + " on the high score list ");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
