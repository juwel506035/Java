import java.util.Scanner;

public class Area {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        System.out.print("Circle area is:" + area);
    }
}
