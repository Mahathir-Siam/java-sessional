public class Shape {
    double area(double length, double width) {
        return length * width;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of Rectangle (5.0 * 3.0): " + shape.area(5.0, 3.0));
        System.out.println("Area of Circle (radius 4.0): " + shape.area(4.0));
    }
}
