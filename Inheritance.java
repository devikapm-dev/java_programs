// Program to demonstrate Inheritance in Java

// Parent class
class Animal
{
    // Instance variables
    String name;
    String sound;

    // Method to show eating behavior
    void eat()
    {
        System.out.println(name + " is eating!");
    }

    // Method to show sleeping behavior
    void sleep()
    {
        System.out.println(name + " is sleeping!");
    }

    // Method to show sound
    void makeSound()
    {
        System.out.println(name + " says " + sound);
    }
}

// Child class 1 — inherits from Animal
class Dog extends Animal
{
    // Dog's own unique method
    void fetch()
    {
        System.out.println(name + " is fetching the ball!");
    }
}

// Child class 2 — inherits from Animal
class Cat extends Animal
{
    // Cat's own unique method
    void purr()
    {
        System.out.println(name + " is purring!");
    }
}

// Main class
class Main
{
    public static void main(String[] args)
    {
        // Create Dog object
        Dog d = new Dog();
        d.name = "Tommy";
        d.sound = "Woof";

        System.out.println("--- Dog ---");
        d.eat();        // inherited from Animal
        d.sleep();      // inherited from Animal
        d.makeSound();  // inherited from Animal
        d.fetch();      // Dog's own method

        // Create Cat object
        Cat c = new Cat();
        c.name = "Kitty";
        c.sound = "Meow";

        System.out.println("\n--- Cat ---");
        c.eat();        // inherited from Animal
        c.sleep();      // inherited from Animal
        c.makeSound();  // inherited from Animal
        c.purr();       // Cat's own method
    }
}