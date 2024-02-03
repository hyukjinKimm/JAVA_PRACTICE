package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int [][] arr = new int[2][3]; // 2행3열
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j ++){
                System.out.println("i: "+ i + " j :" + j + "arr : " + arr[i][j]);
            }
        }

    }
}
