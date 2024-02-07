package method;

public class Overloading1 {
    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(add(1, 2,3));
   }

    // 메서드 시그니쳐 ( 이름 + 파라메터)
    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static double add(double a, double b){
        return a + b;
    }
}
