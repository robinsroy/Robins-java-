abstract class Appliance {
    void turnOn() {
        System.out.println("Appliance is on.");
    }
}

interface RemoteControl {
    void control();
}

class TV extends Appliance implements RemoteControl {
    public void control() {
        System.out.println("Remote controlling TV.");
    }
}

public class HomeAppliance {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.control();
    }
}
