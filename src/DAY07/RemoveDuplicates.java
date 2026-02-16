public class RemoveDuplicates {
    static int remove(int[] nums) {
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(remove(arr));
    }
}
