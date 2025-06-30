public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.company();
        son.car();
        son.ownProperty();
    }
}

class Grandfather {
    void company() {
        System.out.println("Grandfather's company: ABC Ltd.");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father's car: BMW.");
    }
}

class Son extends Father {
    void ownProperty() {
        System.out.println("Son's property: Gaming PC.");
    }
}
