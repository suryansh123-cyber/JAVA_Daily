package DAY02;
import java.util.*;

public class QUES5 {
    public static void main(String[] args) {
        //reverse a number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int mod = a%10;
            System.out.print(mod);
            a /=10;
        }
        System.out.println(" ");
    }
}
