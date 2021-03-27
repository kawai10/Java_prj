public class Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i<10; i++)
            System.out.printf("%d ",nums[i]);

        int[] temp = new int[11];
        for (int i =0; i<10; i++)
            temp[i] = nums[i];

        nums = temp;

        nums[10] = 11;
        for(int i = 0; i<11; i++)
            System.out.printf("%d ",nums[i]);

    }
}
