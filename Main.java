public class Main {
    public static void main(String[] args) {

        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("This is another of them");
        }

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateSore(true,5000,5, 100);

        calculateSore(true,4000,5,100);


        if (score < 5000 && score >= 4000) {
            System.out.println("The score is less than but greater than 4000");
        } else if (score == 4000) {
            System.out.println("Score is equal to 5000");
        }   else {
            System.out.println("it is wrong");
        }
    }

    public static void calculateSore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (score == 5000)
            if (score >= 2000) {
                System.out.println("You Won");
            }   else {
                System.out.println("GameOver");
            }
    }

}
