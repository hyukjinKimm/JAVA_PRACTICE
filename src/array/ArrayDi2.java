package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        int [][] arr = new int[10][4];
        int k = 0;
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                arr[i][j] = k;
                k += 1;
            }
        }
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[i].length; j ++){
                System.out.println("i: "+ i + " j :" + j + " arr : " + arr[i][j]);
            }
        }

    }
}
