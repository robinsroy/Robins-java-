class Employee {
    protected String name;
    protected double salary;
}

class Manager extends Employee {
    public Manager(String n, double s) {
        name = n;
        salary = s;
    }
    public void display() {
        System.out.println("Manager Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Employees {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 90000);
        m.display();
    }
}
