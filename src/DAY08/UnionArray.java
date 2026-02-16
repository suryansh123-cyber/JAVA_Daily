import java.util.*;

public class UnionArray {
    static int unionCount(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);
        for (int x : b) set.add(x);
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,3,4};
        System.out.println(unionCount(a,b));
    }
}
