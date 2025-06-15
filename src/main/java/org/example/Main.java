package org.example;
////Liskov Substitution Principle
////According to this principle Derived child classes must be substitutable for their base classes without affecting the correctness of the program.
////Problemmatic apparoach
//class Vehicle{
//     public void startEngine(){
//        System.out.println("Engine is starting");
//    }
//}
//class Car extends Vehicle{
//    @Override
//    public void startEngine(){
//        System.out.println(" mmmmmm");
//    }
//}
//class Bicycle extends Vehicle {
//    @Override
//    public void startEngine() {
//        // bicycle has no engine
//        throw new UnsupportedOperationException("Bicycle doesn't have engine");
//    }
//
//
//    public static void main(String[] args) {
//        Vehicle vehicle = new Car();
//        vehicle.startEngine(); //
//
//
//        vehicle = new Bicycle(); // This will cause an issue
//        vehicle.startEngine(); // Throws UnsupportedOperationException
//    }
//}

// correct way
abstract class Vehicle{
    // common vehicle behaviours
    public void move(){
        System.out.println("Vehicle is moving");

    }
}
abstract class EngineVehicle extends Vehicle {
    public void startEngine(){
        System.out.println("Engine is starting");
    }
}
abstract class NonEngine extends Vehicle{
    public void working(){
        System.out.println("Good for environment ");
    }
}
class Car extends EngineVehicle{
    @Override
    public void startEngine(){
        System.out.println("Lets go for a ride");
    }
}
class Bicycle extends NonEngine{
    @Override
    public void working() {
        System.out.println("Bicycle is eco-friendly and good for health");
    }

    public static void main(String[] args) {
        //using EnineVehicle

        EngineVehicle car = new Car();
        car.startEngine();
        car.move();
       NonEngine bicycle = new Bicycle();
        bicycle.working();
        bicycle.move(); // Bicycle can still move, but it doesn't have an engine
    }
}
