package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);


        //kakao 결제

        while (true) {
            System.out.print("결제 수단을 입력해 주세요: ");
            String payOption = scanner.next();
            scanner.nextLine();
            System.out.print("결제 금액을 입력해 주세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("결제를 종료합니다");
                break;
            }
            payService.processPay(payOption, amount);

        }


    }
}