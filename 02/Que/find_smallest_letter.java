
public class find_smallest_letter {
    public static void main(String[] args) {
        char[] nums = { 'c', 'f', 'j' };
        char target = 'c';
        System.out.println(nextGreatestLetter(nums, target));
    }

    static char nextGreatestLetter(char[] nums, char target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start % nums.length];
        // another way to return 
        //  return start < nums.length ? nums[start] : nums[0];
    }
}
