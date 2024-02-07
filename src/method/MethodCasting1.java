package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 3.0;
        printNumber((int)number); // 명시적 형변환
        

    }
    public static void printNumber(int x){
        System.out.println("x = " + x);
    }
}
