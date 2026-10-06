class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int current = nums[i];
            int tempMax = Math.max(current, Math.max(current*max, current*min));
            int tempMin = Math.min(current, Math.min(current*max, current*min));
            max = tempMax;
            min = tempMin;
            ans = Math.max(ans, max);
        }
        return ans;
    }
}