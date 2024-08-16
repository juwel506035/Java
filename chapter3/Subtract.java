import java.util.Scanner;

public class Subtract {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number1: ");
        int a = scanner.nextInt();

        System.out.println("Enter The number2: ");
        int b = scanner.nextInt();

         int Subtract = a-b;
         System.out.println("The ans is: "+Subtract);

    }
}
