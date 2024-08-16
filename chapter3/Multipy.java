import java.util.Scanner;
public class Multipy {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The Number1: ");
        int a = scanner.nextInt();

        System.out.println("Enter The Number2: ");
        int b = scanner.nextInt();

        int Multipy = a*b;
        System.out.println("The ans is: "+ Multipy);
    }
}
