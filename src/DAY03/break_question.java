import java.util.*;
public class break_question {
    public static void main(String[] args) {
        // break statement question
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("you entered a multiple of 10, exiting the loop.");
                break;
            }
            System.out.println("you entered: "+n+" now next number: ");
        }
    }
}
