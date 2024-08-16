import java.util.Scanner;

public class HourToMinute {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter hour- ");
        int hour=sc.nextInt();

        int minute=hour*60;
        System.out.println(hour+"hour is equal to "+minute+"minute");
    }
}
