package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("문자를 입력해 주세요: ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            System.out.println("str = " + str);
        }
    }
}
