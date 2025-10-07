class Shape {
    // Final static variable for PI
   final static double PI = 3.14159;

    // Default constructor
   Shape() {
        System.out.println("Shape Calculator Initialized");
    }

    // Method 1: Area of square
    double calculateArea(double side) {
        return side * side;
    }

    // Method 2: Area of rectangle
   double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // (Optional) Method 3: Area of circle
    public double calculateArea(int radius) {
        return PI * radius * radius;
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();  // Calls constructor

        // Area calculations
        double squareArea = shape.calculateArea(5);  // Calls method with 1 double (square)
        double rectangleArea = shape.calculateArea(5.0, 10.0); // rectangle
        double circleArea = shape.calculateArea(7); // circle (int version)

        // Output
        System.out.println("Area of square (side = 5): " + squareArea);
        System.out.println("Area of rectangle (5 x 10): " + rectangleArea);
        System.out.println("Area of circle (radius = 7): " + circleArea);
    }
}
