public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your highScore was " + highScore);

        score = 800;
        levelCompleted = 5;
        bonus = 100;

        System.out.println("The next highScore is " +
                calculateScore(true, 800,5,100));

    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += 1000;
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
}
