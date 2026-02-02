package src.DAY3;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //continue question : display all the numbers entered by the user except multiples of 3
        while(true){
            int num = sc.nextInt();
            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
