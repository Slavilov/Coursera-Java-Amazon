public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(9.0);

        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        System.out.println("The area of the Rectangle is: " +areaOfRectangle);
        System.out.println("The area of the Circle is: " +areaOfCircle);
    }
}
