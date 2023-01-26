public class DecimalComparator {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-3.1756, -3.1756);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Rounded = (int) (num1 * 1000);
        int num2Rounded = (int) (num2 * 1000);
        return num1Rounded == num2Rounded;
    }
}
