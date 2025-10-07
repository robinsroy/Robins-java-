import java.util.Scanner;

interface ShapeI {
    void draw();
}

class Circle2 implements ShapeI {
    public void draw() { System.out.println("Drawing circle"); }
}

class Square2 implements ShapeI {
    public void draw() { System.out.println("Drawing square"); }
}

class Triangle2 implements ShapeI {
    public void draw() { System.out.println("Drawing triangle"); }
}

class ShapeFactory {
    public ShapeI getShape(String type) {
        switch (type.toLowerCase()) {
            case "circle": return new Circle2();
            case "square": return new Square2();
            case "triangle": return new Triangle2();
            default: return null;
        }
    }
}

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape to draw (circle/square/triangle): ");
        String type = sc.nextLine();

        ShapeFactory factory = new ShapeFactory();
        ShapeI shape = factory.getShape(type);

        if (shape != null) shape.draw();
        else System.out.println("Invalid shape.");
        sc.close();
    }
}
