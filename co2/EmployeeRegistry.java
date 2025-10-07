// No 'public' keyword here
class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }

    // Update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}

// This is the only public class
public class EmployeeRegistry {
    public static void promote(Employee emp, double bonus) {
        double updatedSalary = emp.getSalary() + bonus;
        emp.updateSalary(updatedSalary);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee(101, "Alice", 50000);
        employees[1] = new Employee(102, "Bob", 60000);
        employees[2] = new Employee(103, "Charlie", 45000);

        System.out.println("Employee Records:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        employees[0].updateSalary(55000);
        promote(employees[2], 5000);

        System.out.println("After Salary Update:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}
