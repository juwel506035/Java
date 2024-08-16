import java.util.Scanner;

public class DayToMonth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day- ");

        int day = scanner.nextInt();
        int month = day/30;
        int newDay = day-(month*30);
        System.out.println(day+"day is equal to "+month+"month and"+newDay+"day");
    }
}
