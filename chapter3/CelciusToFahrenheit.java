import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temperrature in Celcius:");
        double celcius=sc.nextDouble();

        double fahrenheit=(celcius*9/5)+32;
        System.out.println("Temperature in Fahrenheit:"+fahrenheit);
    }
}
