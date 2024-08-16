import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number-1: ");
        int a = sc.nextInt();

        System.out.println("Enter The Number-2: ");
        int b = sc.nextInt();

        System.out.println("Enter The Number-3: ");
        int c = sc.nextInt();

        float avg =(float) (a+b+c)/3;
        System.out.println("The ans is: "+avg);
    }
}
