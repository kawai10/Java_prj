public class Program {
    public static void main(String[] args) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        kor1 = 80;
        kor2 = 75;
        kor3 = 90;

        total = kor1 + kor2 + kor3;
        avg = total / 3;

        System.out.println("┌───────────────────┐");
        System.out.println("│     성적 출력       │");
        System.out.println("└───────────────────┘");

        System.out.println("국어 1 : " + kor1);
        System.out.println("국어 2 : " + kor2);
        System.out.println("국어 3 : " + kor3);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
    }
}
