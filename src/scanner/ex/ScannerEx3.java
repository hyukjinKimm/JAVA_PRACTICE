package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= 9; i ++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
