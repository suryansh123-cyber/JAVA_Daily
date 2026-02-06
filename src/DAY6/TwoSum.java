import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            // check if required value already seen
            if (map.containsKey(required)) {
                return new int[]{map.get(required), i};
            }

            // store current value with index
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // if no solution
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
