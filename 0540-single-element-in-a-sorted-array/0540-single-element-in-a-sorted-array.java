// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}