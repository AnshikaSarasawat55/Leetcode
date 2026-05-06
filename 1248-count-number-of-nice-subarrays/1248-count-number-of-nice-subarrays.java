class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return goal(nums, k) - goal(nums, k - 1);
    }

    public int goal(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        int cnt = 0;
        while (r < nums.length) {
            sum += nums[r] % 2;
            while (sum > goal) {
                sum -= nums[l] % 2;
                l++;
            }
            cnt += r - l + 1;
            r++;
        }
        return cnt;
    }

}