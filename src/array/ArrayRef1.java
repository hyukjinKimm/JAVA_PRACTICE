package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5];
        System.out.println(students);
        // 변수 값을 대입

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        for(int i = 0; i < 5 ; i ++){
            System.out.println("학생 " + i + "의 점수 :" + students[i]);
        }


    }
}
