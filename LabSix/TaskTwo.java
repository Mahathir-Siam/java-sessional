class Person {
    void displayInfo() {
        System.out.println("I am a person.");
    }
}

class Doctor extends Person {
    void work() {
        System.out.println("I treat patients.");
    }
}

class Teacher extends Person {
    void work() {
        System.out.println("I teach students.");
    }
}

class Engineer extends Person {
    void work() {
        System.out.println("I build and design systems.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher teach = new Teacher();
        Engineer eng = new Engineer();

        System.out.println("Doctor:");
        doc.displayInfo();
        doc.work();

        System.out.println("\nTeacher:");
        teach.displayInfo();
        teach.work();

        System.out.println("\nEngineer:");
        eng.displayInfo();
        eng.work();
    }
}
