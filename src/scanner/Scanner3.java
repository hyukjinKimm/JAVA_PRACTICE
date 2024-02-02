package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 1을 입력해 주세요 ");
        int num1 = scanner.nextInt();
        System.out.println("숫자 2를 입력해 주세요");
        int num2 = scanner.nextInt();
        int result = (num1>=num2) ? num1 : num2;
        System.out.println(result);

    }
}
