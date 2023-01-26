public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            //System.out.println("Hours = " + hours + "min");

            long days = hours / 24;
            //System.out.println("days = " + days + "d");

            long years = days / 365;
            //System.out.println("Years = " + years + "y");

            long remainingHours = hours % 24;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
