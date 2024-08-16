import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The length:");
        int a = scanner.nextInt();

        double area = a*a;
        System.out.println("Square area is: "+area);
    }
        }