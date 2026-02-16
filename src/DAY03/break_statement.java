public class break_statement {
    public static void main(String[] args) {
        //break statement
        for(int i = 1; i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop now");
    }
}
