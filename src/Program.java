public class Program {
    public static void main(String[] args) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        kor1 = 50;
        kor2 = 60;
        kor3 = 80;

        total = kor1 + kor2 + kor3;
        avg = total / 3.0f;

        //성적 출력
        System.out.println("┌───────────────────┐");
        System.out.println("│     성적 출력       │");
        System.out.println("└───────────────────┘");

        System.out.println("국어 1 : " + kor1);
        System.out.println("국어 2 : " + kor2);
        System.out.println("국어 3 : " + kor3);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %6.2f\n", avg);
        System.out.printf("%2$d %3$d %1$d\n", 1,2,3);
    }
}
