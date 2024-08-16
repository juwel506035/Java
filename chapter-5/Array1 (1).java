public class Array1 {

    public static void main(String[] args){
        int[]A={4,5,6,11,10,12,9};
        System.out.println("Index number\t Element at index\t Square of element");
        for(int x = 0; x<8; x++)
            System.out.println("\t"+x+"\t\t\t"+(A[x]*A[x]));
    }
}
