// Program to demonstrate Interface in Java

// Interface — contract that all vehicles must follow
interface Vehicle
{
    // all methods are abstract by default
    void start();   // must implement!
    void stop();    // must implement!
    void fuel();    // must implement!
}

// Car class — signs the Vehicle contract
class Car implements Vehicle
{
    String brand;

    // must implement start()
    public void start()
    {
        System.out.println(brand + " car starts with a key!");
    }

    // must implement stop()
    public void stop()
    {
        System.out.println(brand + " car stops with brake!");
    }

    // must implement fuel()
    public void fuel()
    {
        System.out.println(brand + " car uses petrol!");
    }
}

// Bike class — signs the Vehicle contract
class Bike implements Vehicle
{
    String brand;

    // must implement start()
    public void start()
    {
        System.out.println(brand + " bike starts with kick!");
    }

    // must implement stop()
    public void stop()
    {
        System.out.println(brand + " bike stops with hand brake!");
    }

    // must implement fuel()
    public void fuel()
    {
        System.out.println(brand + " bike uses petrol!");
    }
}

// ElectricCar class — implements Vehicle differently!
class ElectricCar implements Vehicle
{
    String brand;

    // must implement start()
    public void start()
    {
        System.out.println(brand + " electric car starts with a button!");
    }

    // must implement stop()
    public void stop()
    {
        System.out.println(brand + " electric car stops automatically!");
    }

    // must implement fuel()
    public void fuel()
    {
        System.out.println(brand + " electric car uses electricity!");
    }
}

// Main class
class Main
{
    public static void main(String[] args)
    {
        // Car object
        Car car = new Car();
        car.brand = "Toyota";
        System.out.println("--- Car ---");
        car.start();
        car.stop();
        car.fuel();

        // Bike object
        Bike bike = new Bike();
        bike.brand = "Honda";
        System.out.println("\n--- Bike ---");
        bike.start();
        bike.stop();
        bike.fuel();

        // ElectricCar object
        ElectricCar ecar = new ElectricCar();
        ecar.brand = "Tesla";
        System.out.println("\n--- Electric Car ---");
        ecar.start();
        ecar.stop();
        ecar.fuel();
    }
}