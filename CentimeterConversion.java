public class CentimeterConversion {

    public static void main(String[] args) {

        System.out.println("5ft, 8inches = " + convertToCentimeter(5, 8) + "cm");

        System.out.println("68 inches = " + convertToCentimeter(68) + "cm");

    }

    public static double convertToCentimeter(int inchHeight) {

        double numberOfCentimeter = (double) (inchHeight * 2.54);
        return numberOfCentimeter;
    }

    public static double convertToCentimeter(int footHeight, int remainingHeight) {
        int inchHeight = (int) ((footHeight * 12.000) + remainingHeight);
        double numberOfCentimeter = (double) (inchHeight * 2.54);
        return numberOfCentimeter;
    }
}
