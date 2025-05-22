public class OBS2 {
    public static void main(String[] args) {
        int[] arr = {33,22,11,9,1};
        int target = 9;
        System.out.println(orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        Boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
