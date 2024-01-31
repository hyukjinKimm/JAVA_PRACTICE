package loop;

public class While2_1 {
    public static void main(String[] args) {

        int sum = 0;
        int cnt = 0;
        while(cnt<3){
            cnt += 1;
            sum += cnt;
        }
        System.out.println(sum);
    }
}
