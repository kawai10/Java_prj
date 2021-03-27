public class Array4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        for(int i=0; i<7; i++)
            System.out.println(nums[i]);

        int temp;

        temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;

        for(int i=0; i<7; i++)
            System.out.println(nums[i]);
    }
}
