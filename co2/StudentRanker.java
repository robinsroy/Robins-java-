class Student {
    // Private instance variables
    private String name;
    private int marks;

    // Constructor 1: Accepts only name, marks set to 0
    public Student(String name) {
        this.name = name;
        this.marks = 0;
    }

    // Constructor 2: Accepts name and marks
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to set marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to calculate grade
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-------------------------");
    }
}

public class StudentRanker {
    public static void main(String[] args) {
        // Creating student with only name, then setting marks
        Student student1 = new Student("Alice");
        student1.setMarks(85);

        // Creating student with name and marks directly
        Student student2 = new Student("Bob", 72);

        // Display results
        student1.displayResult();
        student2.displayResult();
    }
}
