// Program to demonstrate Abstraction in Java

// Abstract class — cannot create object directly
abstract class Shape
{
    // abstract method — no body, must be implemented by child!
    abstract void calculateArea();

    // normal method — inherited by all child classes
    void display()
    {
        System.out.println("I am a shape!");
    }
}

// Child class 1 — implements calculateArea()
class Circle extends Shape
{
    double radius;

    void calculateArea()
    {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

// Child class 2 — implements calculateArea()
class Rectangle extends Shape
{
    double length, width;

    void calculateArea()
    {
        double area = length * width;
        System.out.println("Rectangle Area = " + area);
    }
}

// Child class 3 — implements calculateArea()
class Triangle extends Shape
{
    double base, height;

    void calculateArea()
    {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area = " + area);
    }
}

class Main
{
    public static void main(String[] args)
    {
        // Circle object
        Circle cir = new Circle();
        cir.radius = 5.0;
        cir.display();          // inherited from Shape
        cir.calculateArea();    // Circle's own implementation

        // Rectangle object
        Rectangle rec = new Rectangle();
        rec.length = 4.0;
        rec.width = 6.0;
        rec.display();          // inherited from Shape
        rec.calculateArea();    // Rectangle's own implementation

        // Triangle object
        Triangle tri = new Triangle();
        tri.base = 3.0;
        tri.height = 8.0;
        tri.display();          // inherited from Shape
        tri.calculateArea();    // Triangle's own implementation
    }
}