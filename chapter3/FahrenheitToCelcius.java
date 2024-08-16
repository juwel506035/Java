import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temperrature in Fahrenheit:");
        double fahrenheit=sc.nextDouble();

        double celcius =(fahrenheit-32)*5/9;
        System.out.println("Temperature in Celcius:"+celcius);
    }
}
