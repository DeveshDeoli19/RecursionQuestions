public class arraySorted{

    static boolean isSorted(int[] arr, int idx){

        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return isSorted(arr,idx+1);
        }
       return false;
    }
    public static void main(String[] args){

        boolean result;
    int[] a = {1,2,3,4,5};
    
        result = isSorted(a,0);
        System.out.print(result);
    }
}