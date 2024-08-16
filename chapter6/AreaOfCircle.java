import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double r = sc.nextDouble();
        double area = (22*r*r)/7;
        System.out.print("Circle area is:" + area);
    }
}

