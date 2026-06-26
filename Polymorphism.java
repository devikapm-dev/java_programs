// Class to show Method Overloading

class Calculator
{
    // same method name — different parameters!
    void add(int a, int b)
    {
        System.out.println("Sum of 2 numbers = " + (a+b));
    }
    void add(int a, int b, int c)
    {
        System.out.println("Sum of 3 numbers = " + (a+b+c));
    }
    void add(double a, double b)
    {
        System.out.println("Sum of 2 decimals = " + (a+b));
    }
}

// Parent class to show Method Overriding
class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

// Child class overrides sound()
class Dog extends Animal
{
    void sound()  // overrides parent!
    {
        System.out.println("Dog says Woof!");
    }
}

class Main
{
    public static void main(String[] args)
    {
        // Test overloading
        Calculator calc = new Calculator();
        calc.add(5, 10);
        calc.add(5, 10, 15);
        calc.add(5.5, 10.5);

        // Test overriding
        Animal a = new Animal();
        a.sound();  // Animal's sound

        Dog d = new Dog();
        d.sound();  // Dog's sound — overridden!
    }
}