public class linear_search {
    
    public static int linearSearch(int number[], int key){
        for(int i = 0; i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,2,23,44,67,94,15,98};
        int key = 44; 
        
        int result = linearSearch(arr,key);
        if(result==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key is at " + result + " index");
        }
    }
}
