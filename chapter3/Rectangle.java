import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length: ");
        int A = sc.nextInt();

        System.out .println("Enter The width: ");
        int B = sc.nextInt();

        int area = A*B;
        System.out.println("Rectangle area is: "+area);

    }
}
