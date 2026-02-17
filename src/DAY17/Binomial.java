public class Binomial {
   public static int fact(int n){
    int f1 = 1;
    for(int i = 1; i<=n; i++){
        f1*=i;
    }
    return f1;
   }
   public static int binCoe(int n, int r){
    int f1 = fact(n);
    int f2 = fact(r);
    int f3 = fact(n-r);
    return f1/(f2*f3);
   } 
   public static void main(String[] args) {
    int ans = binCoe(5,4);
    System.out.println(ans);
   }
}
