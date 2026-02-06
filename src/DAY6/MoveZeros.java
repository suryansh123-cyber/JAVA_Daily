import java.util.Arrays;

public class MoveZeros {

    static void moveZeroes(int[] nums) {
        int index = 0;

        // move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // fill remaining with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
