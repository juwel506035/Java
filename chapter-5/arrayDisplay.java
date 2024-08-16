import java.util.*;
public class arrayDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 array elements");
        int[]Arr = new int[10];

        for (int i = 0; i < Arr.length; i++)
            Arr[i] = sc.nextInt();
          System.out.println("Array;j++");
        for (int i = 0;i < Arr.length;i++)
          System.out.println(Arr[i]);
    }
}
