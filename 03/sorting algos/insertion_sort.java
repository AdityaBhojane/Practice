import java.util.Arrays;

public class insertion_sort {
    // compare elements one by one with all element on left and put it at the right spot
    public static void main(String[] args) {
        int arr[] = {4,3,2,8,10,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
         for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
         }
         return arr;
    }
}
