public class gfg_element_on_infinite_sorted_array {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int k = 10;
        System.out.println(ans(arr, k));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        // search correct search box for the given target
        while(target > arr[end]){
            int newStart = end + 1;
            // double the size of the box 
            end = end + ( end - start +1)*2;
            start = newStart;
        };
        return BinarySearch(arr, start, end, target);
    };

    static int BinarySearch(int[] arr,int start, int end, int target){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start= mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        };
        return -1;
    }
}