package org.example;
// Open/Closed Principle
//// Incorrect Approach
//class Shape {
//    private String type;
//
//    public double calculateArea() {
//        if (type.equals("Circle")) {
//            // Cirle area calculation
//
//        } else if (type.equals("rectangle")) {
//            // Rectangle area calculation
//        }
//        //Adding a traingle requires modifying this method
//        return 0.0;
//    }
//}


// Correct Approach
abstract  class Shape{
    abstract double calaculateArea();
    // we can also use interfaces instead of abstract
}
 class Circle extends Shape{
    private double radius;
// constructor


    @Override
    double calaculateArea() {
        return Math.PI * radius * radius;
    }
 }
   class Rectangle extends Shape{
     private double height;
      private double width;
     @Override
       double calaculateArea(){
         return width*height;
     }

   }
   class Triangle extends Shape {
       private double base;
       private double height;

       @Override
       double calaculateArea() {
           return base * height;
       }

       public static void main(String[] args) {
              Shape circle = new Circle();
              Shape rectangle = new Rectangle();
              Shape triangle = new Triangle();

              System.out.println("Circle Area: " + circle.calaculateArea());
              System.out.println("Rectangle Area: " + rectangle.calaculateArea());
              System.out.println("Triangle Area: " + triangle.calaculateArea());

       }
   }
