// final class cannot be extended
final class FinalClass { }

// class Demo extends FinalClass { } 

class Base {
    final void show() {
        System.out.println("This is a final method.");
    }
}

class Derived extends Base {
    // void show() { } // 
}

public class FinalKeyword {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();
    }
}
