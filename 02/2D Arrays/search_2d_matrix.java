
public class search_2d_matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        System.out.println(searchMatrix(arr, 4));
    }
    static boolean searchMatrix(int[][] matrix,int target){
        for(int i = 0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length - 1;
            while(start<=end){
                int mid = start + ( end - start )/2;
                if(matrix[i][mid] < target){
                    start = mid + 1;
                }else if(matrix[i][mid] > target){
                    end = mid - 1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
