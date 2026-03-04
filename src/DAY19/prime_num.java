public class prime_num {
    public static boolean isPrime(int n){
        boolean prime = true;
        for(int i = 2; i<= n-1; i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        int n = 100;
        for(int i = 2; i<=n; i++){
            boolean a = isPrime(i);
            if(a==true){
                System.out.println(i);
            }
        }
    }
}
