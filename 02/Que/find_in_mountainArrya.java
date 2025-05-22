public class find_in_mountainArrya {
    public static void main(String[] args) {
        int[] mountainArr = {4,5,6,7,0,1,2};
        // int[] mountainArr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 0;
        int peakElement = findPeakIndex(mountainArr);
        int tryAsc = orderAgnosticBS(mountainArr, target, 0, peakElement);
        if (tryAsc != -1) {
            System.out.println(tryAsc);
        } else {
            System.out.println(orderAgnosticBS(mountainArr, target, peakElement + 1, mountainArr.length - 1));
        }
    }

    static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        ;
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
