public class ShapeMetricCalculator {
    public static double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length*rectangle.width;
    }

    public static double calculateCircleArea(Circle circle){
        double area = Math.PI * Math.pow(circle.radius, 2);
        return area;
    }
}
