public class fact {
    public static int factor(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        int ans = factor(5);
        System.out.println(ans);
    }
}
