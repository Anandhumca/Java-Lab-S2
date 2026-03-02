
class Shape {
    double area() {
        return 0;   
    }
}


class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    double area() {
        return length * width;
    }
}


class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}


class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    @Override
    double area() {
        return side * side;
    }
}


public class overrid {
    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 5);
        Shape circ = new Circle(7);
        Shape sq = new Square(4);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Circle Area: " + circ.area());
        System.out.println("Square Area: " + sq.area());
    }
}

