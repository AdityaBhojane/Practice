public class gfg_search_rotated_duplicate_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 1, 2, 3 };
        int target = 2;
        int peakElement = findPivot(arr);
        if (arr[peakElement] == target) {
            System.out.println(peakElement);
        }
        if (target < arr[0]) {
            System.out.println(BS(arr, target, peakElement + 1, arr.length - 1));
        } else {
            System.out.println(BS(arr, target, 0, peakElement - 1));
        }
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

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            /**
             * 2nd condition so there might be a case where start and mid can be equal
             * so we checking that also if mid is greater than end then also can have to
             * move start to mid + 1 because as we know we cannot find pivot on right
             * as its big number in array.
             */
            else if (arr[mid] > arr[start] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr.length - 1;
    }
}
