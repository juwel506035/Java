public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][]twoD_array=new int[3][4];
        for (int row = 0;row <twoD_array.length; row++ ){
            for(int col = 0; col<twoD_array[row].length;col++){
                twoD_array[row][col] =row + col;
            }
        }
        for (int[]temp:twoD_array){
            for(int val : temp ){
                System.out.println(val+"");
            }
            System.out.println();
        }
    }
}
