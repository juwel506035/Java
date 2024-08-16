import java.util.Scanner;
class Tester {
    public void display() {
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape {
    public void area() {
        System.out.println("Inside area");
    }
}
class Cube extends Rectangle {
    public void volume() {
        System.out.println("Inside volume");
    }
}
public class Shape {
    public static void main(String[] arguments) {
        Cube cube = new Cube();
        cube.area();
        cube.volume();
    }
}


