package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = createStudent("혁진", 22, 90);
        Student student2 = createStudent("미호", 23, 90);
        printStudent(student1);
        printStudent(student2);

    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }
    static void printStudent(Student std){
        System.out.println("이름: " + std.name + " 나이 : " + std.age + " 성적: " + std.grade);
    }

    static void initStudent(Student std, String name, int age, int grade){
        std.name = name;
        std.age = age;
        std.grade = grade;
    }
}
