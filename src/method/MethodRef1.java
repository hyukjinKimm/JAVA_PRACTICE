package method;

public class MethodRef1 {
    public static void main(String[] args) {

        int sum = add(1, 2);
        System.out.println("sum = " + sum);
    }
    // add 메서드
    public static int add(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + "+" + b + " 연산수행");
        return a + b;
    }
}
