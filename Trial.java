public class Trial {
    public static void main(String[] args) {

        boolean age = true;
        int myCurrentYear = 2023;
        int dateOfBirth = 1999;
        int myNewAge = myCurrentYear;

        calculateMyAge(true,2023, 1999);
        System.out.println("myNewAge is " + (myCurrentYear - dateOfBirth));

        int newAge = calculateMyAge(true, 2023, 1999);
        System.out.println("The highScore is " + newAge);

    }

    public static int calculateMyAge (boolean age, int myCurrentYear, int dateOfBirth) {

        int myNewAge = myCurrentYear;

        if (age == true) {
            myNewAge -= dateOfBirth;
        }
        return myNewAge;
    }
}
