public class search_first_last_position {

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = { -1, -1 };
        int start = binarySearch(nums, target, true);
        int end = binarySearch(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(ans);
    }

    static int binarySearch(int[] nums, int target, boolean findStartIdx) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (findStartIdx) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}