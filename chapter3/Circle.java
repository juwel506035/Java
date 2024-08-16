import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Radius: ");
        int r = scanner.nextInt();
        double area = Math.PI*r*r;
        System.out.println("Circle area is: "+area);

    }
}
