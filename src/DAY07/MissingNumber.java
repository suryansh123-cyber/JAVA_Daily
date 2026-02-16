public class MissingNumber {
    static int missing(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int n : nums) sum -= n;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missing(arr));
    }
}
