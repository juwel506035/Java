import java.util.Scanner;

public class SecondToHour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter second- ");
        int second=sc.nextInt();

        int minute=second/60;
        int hour=minute/60;
        int newMinute=minute-hour*60;

        int newSecond=second-minute*60;
        System.out.println(second+"second is equal to"+hour+"hour and"+newMinute+"minute and"+newSecond+"second..");
    }
}
