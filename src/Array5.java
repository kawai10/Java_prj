import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] lotto = new int[6];
        for(int i = 0; i<6;i++)
            lotto[i] = rand.nextInt(45) + 1;

        for(int i=0; i<6; i++)
            System.out.printf("%d ",lotto[i]);
    }
}
