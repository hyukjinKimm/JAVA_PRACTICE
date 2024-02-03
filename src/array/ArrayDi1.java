package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int [][] arr = new int[][]{
            {1, 2, 3},
            {4, 5, 6}
        };
        int [][] brr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                System.out.println("i: "+ i + " j :" + j + " arr : " + arr[i][j]);
            }
        }

    }
}
