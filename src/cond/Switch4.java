package cond;

public class Switch4 {
    public static void main(String[] args) {

        int grade = 2;
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 3000;

        };
        System.out.println(coupon);
    }
}
