import java.util.Scanner;
public class practise{

    public static void main(String[] args) {
        int countPositive=0,countNegative=0,countZero=0;

        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Enter number or type 'exit' to quit:");
            String input = sc.next();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Positive numbers: " + countPositive);
                System.out.println("Negative numbers: " + countNegative);
                System.out.println("Zero numbers: " + countZero);
                break;
            }
            int a = Integer.parseInt(input);
            if(a<0){
                countNegative++;
            }
            else if(a>0){
                countPositive++;
            }
            else{
                countZero++;
            }

        }
    }
}