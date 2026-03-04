public class one {
    //function overloading: function with same name but different parameters, function depends on the parameters not on the return type!
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    public static int sum(int a, int b){
        return a+ b;
    }
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2f, 3f));
    }
}
