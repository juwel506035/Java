import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int r,s = 0,  temp;
        int n = 788;
        temp = n;
        int sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number:");
        else
            System.out.println("not palindrome");
    }
}
