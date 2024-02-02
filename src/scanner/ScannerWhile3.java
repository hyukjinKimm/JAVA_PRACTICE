package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            int tmp = scanner.nextInt();
            System.out.println("입력한 숫자: " + tmp);
            if (tmp == 0){
                break;
            }
            sum += tmp;

        }
        System.out.println("sum = " + sum);
    }


}
