package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("이름을 입력하세여 : " );
            String name = scanner.nextLine();
            if(name.equals("종료")) break;

            System.out.print("나이를 입력하세여: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("당신의 이름: " +name + " 당신의 나이 " + age);
        }
    }
}
