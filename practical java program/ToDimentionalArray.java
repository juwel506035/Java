 import java.util.Scanner;
public class ToDimentionalArray {
    public static void main(String[]args){
        int[][]a={{35,25,17,},{55,12,37}};
        int[][]b={{23,65,32,},{44,12,88}};
        int rows,columms;

        for (rows=0;rows<a.length;rows++){
            for (columms=0;columms<a[0].length;columms++){
                Sum[rows][columms]=a[rows][columms]+b[rows][columms];

            }
        }
         System.out.println("Sum of those Tow Array are:");
        for (rows=0;rows<a.length;rows++){
            for (columms=0;columms<a[0].length;columms++){
                for (rows=0;rows<a.length;rows++){
                    for (columms=0;columms<a[0].length;columms++) {
                        System.out.format("%d \t", Sum[rows][columms]);
                    }
                    System.out.println("");

                }
    }

}
