import java.util.Scanner;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

public class DrawShape {  // <-- main class must be public and match filename
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape (circle, square, triangle): ");
        String input = sc.nextLine().toLowerCase();

        Shape shape;
        switch (input) {
            case "circle":
                shape = new Circle();
                break;
            case "square":
                shape = new Square();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            default:
                System.out.println("Invalid shape");
                return;
        }
        shape.draw();
    }
}
