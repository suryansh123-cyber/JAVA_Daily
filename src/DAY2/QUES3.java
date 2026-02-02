package DAY2;

import java.util.Scanner;

public class QUES3 {
    public static void main(String[] args) {
        //print sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
           sum = sum+i;
           i++;

        }
        System.out.println("Sum is : "+sum);
    }
}
