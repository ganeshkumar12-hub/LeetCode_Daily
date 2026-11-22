
class Solution {
    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum += nums[i];
            sum = Math.max(nums[i],sum);

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
