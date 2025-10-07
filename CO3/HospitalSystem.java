// Abstract Class
abstract class Staff {
    private String name;
    private double baseSalary;  // Encapsulation

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Getters
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

// Doctor subclass
class Doctor extends Staff {
    private int surgeries;  // extra work done

    public Doctor(String name, double baseSalary, int surgeries) {
        super(name, baseSalary);
        this.surgeries = surgeries;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (surgeries * 2000);
    }
}

// Nurse subclass
class Nurse extends Staff {
    private int extraHours;

    public Nurse(String name, double baseSalary, int extraHours) {
        super(name, baseSalary);
        this.extraHours = extraHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * 200);
    }
}

// Admin Staff subclass
class AdminStaff extends Staff {
    private double bonus;

    public AdminStaff(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Staff doctor = new Doctor("Dr. Alice", 50000, 3);
        Staff nurse = new Nurse("Nurse Bob", 30000, 10);
        Staff admin = new AdminStaff("Charlie", 25000, 5000);

        System.out.println(doctor.getName() + " Salary: " + doctor.calculateSalary());
        System.out.println(nurse.getName() + " Salary: " + nurse.calculateSalary());
        System.out.println(admin.getName() + " Salary: " + admin.calculateSalary());
    }
}
