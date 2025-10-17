public class checkArraySort{
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        // if we use length instead of length-1 then there will be error for the below if condition
        if(arr[idx]<arr[idx+1]){
            // array is sorted till now 
            return isSorted(arr,idx+1);
        }
        else{
            return false;
        }
    }
    public static void main(String []args){
        int arr[] = {1,2,3,3};
        System.out.println(isSorted(arr,0));
    }
}