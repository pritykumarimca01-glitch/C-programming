// ============================================================
//         OOPS CONCEPT - PRACTICE QUESTIONS IN JAVA
// ============================================================

// -------------------------------------------------------
// 1. CLASS & OBJECT
// Q: Create a class Car with attributes brand, speed.
//    Create an object and display its details.
// -------------------------------------------------------
class Car {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

// -------------------------------------------------------
// 2. CONSTRUCTOR
// Q: Create a class Student with a constructor to
//    initialize name and age, then display them.
// -------------------------------------------------------
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// -------------------------------------------------------
// 3. INHERITANCE
// Q: Create a base class Animal with a method sound().
//    Create subclass Dog that overrides sound().
// -------------------------------------------------------
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// -------------------------------------------------------
// 4. POLYMORPHISM (Method Overloading)
// Q: Create a class Calculator with overloaded
//    add() method for 2 and 3 integers.
// -------------------------------------------------------
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// -------------------------------------------------------
// 5. ENCAPSULATION
// Q: Create a class BankAccount with private balance.
//    Use getter and setter to access it.
// -------------------------------------------------------
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        if (balance >= 0) this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

// -------------------------------------------------------
// 6. ABSTRACTION (Abstract Class)
// Q: Create an abstract class Shape with abstract
//    method area(). Implement it in Circle and Rectangle.
// -------------------------------------------------------
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { this.length = l; this.width = w; }

    @Override
    double area() {
        return length * width;
    }
}

// -------------------------------------------------------
// 7. INTERFACE
// Q: Create an interface Drawable with method draw().
//    Implement it in classes Triangle and Square.
// -------------------------------------------------------
interface Drawable {
    void draw();
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// -------------------------------------------------------
// 8. MULTILEVEL INHERITANCE
// Q: Create classes Person -> Employee -> Manager
//    Each adds its own display method.
// -------------------------------------------------------
class Person {
    String name = "John";
    void display() { System.out.println("Person: " + name); }
}

class Employee extends Person {
    String company = "Amazon";
    void display() { System.out.println("Employee at: " + company); }
}

class Manager extends Employee {
    String department = "IT";
    void display() { System.out.println("Manager of: " + department); }
}

// -------------------------------------------------------
// 9. STATIC KEYWORD
// Q: Create a class Counter with a static variable
//    that counts how many objects are created.
// -------------------------------------------------------
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Objects created: " + count);
    }
}

// -------------------------------------------------------
// 10. FINAL KEYWORD
// Q: Create a class with a final method and
//    demonstrate it cannot be overridden.
// -------------------------------------------------------
class Vehicle {
    final void fuelType() {
        System.out.println("Runs on Petrol");
    }
}

class Bike extends Vehicle {
    // Cannot override fuelType() - it's final
    void display() {
        System.out.println("This is a Bike");
    }
}

// -------------------------------------------------------
//                        MAIN CLASS
// -------------------------------------------------------
public class OOPSPractice {
    public static void main(String[] args) {

        // 1. Class & Object
        System.out.println("--- 1. Class & Object ---");
        Car car = new Car();
        car.brand = "Toyota";
        car.speed = 120;
        car.display();

        // 2. Constructor
        System.out.println("\n--- 2. Constructor ---");
        Student s = new Student("Alice", 20);
        s.display();

        // 3. Inheritance
        System.out.println("\n--- 3. Inheritance ---");
        Dog dog = new Dog();
        dog.sound();

        // 4. Polymorphism
        System.out.println("\n--- 4. Polymorphism (Overloading) ---");
        Calculator calc = new Calculator();
        System.out.println("Sum(2): " + calc.add(3, 4));
        System.out.println("Sum(3): " + calc.add(3, 4, 5));

        // 5. Encapsulation
        System.out.println("\n--- 5. Encapsulation ---");
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        // 6. Abstraction
        System.out.println("\n--- 6. Abstraction ---");
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        // 7. Interface
        System.out.println("\n--- 7. Interface ---");
        Drawable t = new Triangle();
        Drawable sq = new Square();
        t.draw();
        sq.draw();

        // 8. Multilevel Inheritance
        System.out.println("\n--- 8. Multilevel Inheritance ---");
        Manager m = new Manager();
        m.display();

        // 9. Static Keyword
        System.out.println("\n--- 9. Static Keyword ---");
        new Counter();
        new Counter();
        new Counter();
        Counter.showCount();

        // 10. Final Keyword
        System.out.println("\n--- 10. Final Keyword ---");
        Bike bike = new Bike();
        bike.fuelType();
        bike.display();
    }
}
