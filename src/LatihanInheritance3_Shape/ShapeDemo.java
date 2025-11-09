package LatihanInheritance3_Shape;

// Nama : Atikah Dhiya
// NIM  : L0324007

abstract class Shape {
    abstract double area();

    void printArea() {
        System.out.println("Area = " + area());
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(3, 4),
            new Circle(2),
            new Triangle(5, 3)
        };

        for (Shape s : shapes) {
            s.printArea();
        }

        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }

        System.out.println("Total area dari semua shape = " + total);
    }
}
