package DSA_26;


/*
abstract class Shape {
    abstract double area(); // For cylinder: surface area
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        // Surface area = 2πr² + 2πrh
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape cyl = new Cylinder(3, 7);   
        Shape sqr = new Square(5);        

        System.out.println("Area of Cylinder: " + cyl.area());
        System.out.println("Area of Square: " + sqr.area());
    }
}
*/


interface Shape {
    double area(); 
}

class Cylinder implements Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape cyl = new Cylinder(3, 7);   
        Shape sqr = new Square(5);        

        System.out.println("Area of Cylinder: " + cyl.area());
        System.out.println("Area of Square: " + sqr.area());
    }
}
