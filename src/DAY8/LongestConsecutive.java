import java.util.*;

public class LongestConsecutive {
    static int longest(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        int longest = 0;
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int curr = x;
                int streak = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }
                longest = Math.max(longest, streak);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longest(arr));
    }
}
