import java.util.*;

public class Intersection {
    static int[] intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int x : a) set.add(x);
        for (int x : b)
            if (set.contains(x)) res.add(x);

        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        System.out.println(Arrays.toString(intersection(a,b)));
    }
}
