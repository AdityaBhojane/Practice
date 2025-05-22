import java.util.Arrays;
// compare all pairs and swap until it become sorted 
public class bubble_sort {

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
         for (int k = 0; k < arr.length-1; k++) {
            int i=0;
            while (i < arr.length-1) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                } else {
                    i++;
                }
            }
        }

        return arr;
    }
}