public class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class MainShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw(); 

        s = new Circle();
        s.draw(); 

        s = new Rectangle();
        s.draw(); 
    }
}
