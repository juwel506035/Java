public interface Polygon {
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon{
    public void getArea(int length,int breadth){
        System.out.println("The area of the rectangle is: "+(length*breadth));
    }
}
class Main{
    public static void main(String[] args) {
        Rectangle r1 =new Rectangle();
        r1.getArea(5,6);
    }
}

class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello,World!");
    }
}