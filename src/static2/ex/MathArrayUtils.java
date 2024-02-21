package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils(){

    }
    public static int sum(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i ++){
            tmp += arr[i];
        }
        return tmp;

    }
    public static double average(int[] arr){
        return (double) sum(arr)/ arr.length;
    }
    public static int min(int[] arr){
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (tmp > arr[i]){
                tmp = arr[i];
            }
        }
        return tmp;

    }
    public static int max(int[] arr){
        int tmp = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (tmp < arr[i]){
                tmp = arr[i];
            }
        }


        return tmp;

    }
}
