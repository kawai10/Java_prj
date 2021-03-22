import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        int score1, score2;


        //성적 입력
        Scanner scan = new Scanner(System.in);
        System.out.printf("국어1 : ");
        score1 = scan.nextInt();
        System.out.printf("국어2 : ");
        score2 = scan.nextInt();

        //성적 출력
        System.out.println("국어1 : " + score1);
        System.out.println("국어2 : " + score2);
    }

}
