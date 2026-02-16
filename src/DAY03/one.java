public class one {
    public static void main(String[] args) {
        //reverse a given number
        int num = 10899;
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}