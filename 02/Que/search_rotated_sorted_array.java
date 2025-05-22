public class search_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
        int peakElement = findPivot(arr);
        // int tryAsc = BS(arr, target, 0, peakElement);
        // if (peakElement!= -1 && arr[peakElement] == target) {
        //     System.out.println("Peak " + peakElement);
        // };
        // System.out.println(peakElement);
        // if (tryAsc != -1) {
        //     System.out.println("1st " + tryAsc);
        // } else {
        //     System.out.println("2nd " + BS(arr, target, peakElement + 1, arr.length - 1));
        // }

         if(arr[peakElement] == target){
            System.out.println(peakElement);
        }
        if(target < arr[0]) {
            System.out.println(BS(arr, target,peakElement+1, arr.length -1));
        }else{
            System.out.println(BS(arr, target,0, peakElement-1));
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if( mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr.length -1;

    }

    static int BS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
