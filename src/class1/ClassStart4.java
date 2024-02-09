package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 80;
        System.out.println("student1 = " + student1);
        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 24;
        student2.grade = 90;
        System.out.println("student2 = " + student2);

        Student []students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("이름:  " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }







    }
}
