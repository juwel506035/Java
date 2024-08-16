import java.util.Scanner;
public class PalindromeNumber {
    private static void While(boolean b) {
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number : ");
    int num = sc.nextInt();

    int a = num;
    int rev = 0;
    While(num!=0);{
        rev = rev*10 + num%10;
        num=num /10;
        }
    if(a==rev){
        System.out.println(a+" Palindrome Number ");
    }
    else{
        System.out.println(a+" Not palindrome Number ");
    }

    }


}
