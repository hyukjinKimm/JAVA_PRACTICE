package construct;

public class MemberInitMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "혁진";
        member1.age = 25;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "수정";
        member2.age = 26;
        member2.grade = 28;

        MemberInit[] members = {member1, member2};
        for (MemberInit member: members){
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.grade);

        }

    }
}
