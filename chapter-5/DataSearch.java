import java.util.Scanner;
public class DataSearch {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 1, 5, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int searchValue = sc.nextInt();

        boolean found = false;

        for (int number : numbers) {
            if (number == searchValue) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value" + searchValue + "found in the array.");
        } else {
            System.out.println("Value" + searchValue + " Not found in the array.");
        }
    }

}
