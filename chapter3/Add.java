import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number-1: ");
        int a = scanner.nextInt();

        System.out.println("Enter the number-2: ");
        int b = scanner.nextInt();

        int add = a+b;
        System.out.println("The ans is "+add);

    }
}
