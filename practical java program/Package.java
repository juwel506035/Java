package wahidullah.raju;
import java.io.*;
public class Package {
    public static void main(String[]args)throws IOException {
        int x;
        double y;
        String s;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer nember:");
        s=BR.readLine();
        x =Integer.parseInt(s);
        y =Math.sqrt(x);
        System.out.println("square Root of"+x+"is:"+y);
    }

}
