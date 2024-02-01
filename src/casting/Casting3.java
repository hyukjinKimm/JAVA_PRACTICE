package casting;

public class Casting3 {
    public static void main(String[] args) {

        int maxIntValue = 2147483647;
        // 리터럴은 int 라서 L 을 붙여줘야함
        long maxIntOver = 2147483648L;
        System.out.println(maxIntValue);
        System.out.println(maxIntOver);
        maxIntValue = (int) maxIntOver;
        System.out.println(maxIntValue);
        
        long a = 123L;
        int b = (int)a ;
        System.out.println("b = " + b);
    }
}
