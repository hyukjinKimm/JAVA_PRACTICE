package loop;

public class Nasted1 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i ++) {
            System.out.println("내부 for i :" + i);
            for (int j = 0; j < 3; j ++) {
                System.out.println("내부 for j :" + j);
            }
            System.out.println();
        }
    }
}
