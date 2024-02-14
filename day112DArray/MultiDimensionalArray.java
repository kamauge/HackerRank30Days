package day112DArray;

public class MultiDimensionalArray {

    public static void main(String[] args) {


        int[][] arr = {
                {1,2,3,4}, //index 0
                {4,5,6}, // index 1
                {7,8,9} // index
        };

        System.out.println(arr.length); // number of rows

        for (int row = 0; row < arr.length; row++){
            //for each col in row
            for (int col = 0; col< arr[row].length; col++){
                System.out.println("Row: " + row + ", Column: " + col + ", Value: " + arr[row][col]);
               // arr[row][col] =

            }

        }
    }
}
