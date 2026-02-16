public class PairSum {
    static boolean hasPair(int[] arr, int sum) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int s = arr[l] + arr[r];
            if (s == sum) return true;
            if (s < sum) l++;
            else r--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8};
        System.out.println(hasPair(arr, 10));
    }
}
