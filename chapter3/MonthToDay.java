import java.util.Scanner;
public class MonthToDay {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter month-");
        int month=sc.nextInt();

        int day=month*30;
        System.out.println(month+"month is equal to"+day+"day");
    }
}
