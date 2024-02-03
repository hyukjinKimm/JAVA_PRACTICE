package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int []students = {90, 80, 70, 60, 50, 30, 40}; // 선언과 동시에 초기화 해야함.

        for(int i = 0; i < students.length   ; i ++){
            System.out.println("학생 " + (i+1) + "의 점수 :" + students[i]);
        }


    }
}
