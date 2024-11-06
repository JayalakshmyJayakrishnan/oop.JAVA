import java.util.*;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a rectangle is 4");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a triangle is 3");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a hexagon is 6");
    }
}

class Abstract {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();

        System.out.println("Rectangle:");
        r.numberOfSides();

        System.out.println("Triangle:");
        t.numberOfSides();

        System.out.println("Hexagon:");
        h.numberOfSides();
    }
}
