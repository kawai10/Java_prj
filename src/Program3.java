import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int n;
        System.out.println("값을 sp로 구분해서 5개 이상 입력하세요.");

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            n = scan.nextInt();
            if (n < 10)
                continue;
            if (n > 200)
                break;
            System.out.println(n);
        }

    }
}
