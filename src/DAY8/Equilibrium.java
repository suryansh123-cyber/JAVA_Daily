public class Equilibrium {
    static int index(int[] arr) {
        int total = 0, left = 0;
        for (int x : arr) total += x;

        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
            if (left == total) return i;
            left += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println(index(arr));
    }
}
