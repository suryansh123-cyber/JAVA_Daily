public class largestNumber {
    
    public static int largestNum(int arr[], int key){
        for(int i = 0; i<arr.length;i++){
            if(key<arr[i]){
                key = arr[i];
            }
        }
        return key;
    }
    public static void main(String[] args) {
        int []arr = {20,34,67,89,999,32,77,53,54,98,22,200};
        int key = arr[0];
        int ans = largestNum(arr,key);
        System.out.println("Largest number in array is : " + ans);    
    }
}
