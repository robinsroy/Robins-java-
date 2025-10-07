// Smart Home Automation

// Abstract class implementation
abstract class Appliance {
    private int powerRating;

    public Appliance(int powerRating) {
        this.powerRating = powerRating;
    }

    public int getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(int powerRating) {
        if (powerRating >= 0) {
            this.powerRating = powerRating;
        } else {
            System.out.println("Invalid power rating.");
        }
    }

    // Abstract methods
    public abstract void turnOn();
    public abstract void turnOff();

    // Concrete method
    public void displayInfo() {
        System.out.println("Power Rating: " + powerRating + "W");
    }
}

// Subclass: Fan
class Fan extends Appliance {
    public Fan(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Fan is ON now");
    }

    public void turnOff() {
        System.out.println("Fan is OFF now");
    }
}

// Subclass: Light
class Light extends Appliance {
    public Light(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("Light is glowing");
    }

    public void turnOff() {
        System.out.println("Light is OFF now");
    }
}

// Subclass: AC
class AC extends Appliance {
    public AC(int powerRating) {
        super(powerRating);
    }

    public void turnOn() {
        System.out.println("AC is cooling");
    }

    public void turnOff() {
        System.out.println("AC is shut down");
    }
}

// Main class
public class SmartHome {
    public static void main(String[] args) {
        // Create objects using polymorphism
        Appliance fan = new Fan(75);
        Appliance light = new Light(100);
        Appliance ac = new AC(1500);

        // Fan
        fan.turnOn();
        fan.displayInfo();
        fan.turnOff();

        System.out.println();

        // Light
        light.turnOn();
        light.displayInfo();
        light.turnOff();

        System.out.println();

        // AC
        ac.turnOn();
        ac.displayInfo();
        ac.turnOff();
    }
}