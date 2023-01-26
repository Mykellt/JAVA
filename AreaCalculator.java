public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("Area of circle = " + area(10));
        System.out.println("Area of Rectangle = " + area(4, 5));
    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        } else {
            double PI = Math.PI;
            double circleArea = radius * radius * PI;
            double roundedArea = Math.round(circleArea);
            return roundedArea;
        }
    }
    public static double area(double x, double y) {

        if (x < 0 || y < 0 || x < 0 && y < 0) {
            return -1.0;
        } else {
            double areaOfRectangle = x * y;
            return areaOfRectangle;
        }
    }
}
