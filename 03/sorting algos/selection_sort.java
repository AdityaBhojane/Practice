import java.util.Arrays;

// find small or big element and put it on the right spot 
public class selection_sort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 5, 9 };
        System.out.println(Arrays.toString(sort(arr)));
        // System.out.println(findMinIdx(arr, 1));
        // System.out.println(findMaxIdx(arr, 0, 5));
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // this approach for maxIdx
            // every time size wil reduce that why -i 
            // int swapIndex = arr.length - i - 1;
            // int maxIndex = findMaxIdx(arr, 0, swapIndex);
            // if(maxIndex != swapIndex){
            //     int temp = arr[swapIndex];
            //     arr[swapIndex] = arr[maxIndex];
            //     arr[maxIndex] = temp;
            // }

            int minIndex = findMinIdx(arr, i);
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        

        }
        return arr;
    }

    static int findMinIdx(int[] arr, int start) {
        int minIdx = start;

        while (start < arr.length) {
            if (arr[minIdx] > arr[start]) {
                minIdx = start;
            }
            start++;
        }
        return minIdx;
    }
    static int findMaxIdx(int[] arr, int start, int end) {
        int maxIdx = start;

        while (start <= end) {
            if (arr[maxIdx] < arr[start]) {
                maxIdx = start;
            }
            start++;
        }
        return maxIdx;
    }
}
