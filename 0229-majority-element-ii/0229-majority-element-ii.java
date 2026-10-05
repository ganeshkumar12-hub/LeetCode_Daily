// class Solution {
//     public List<Integer> majorityElement(int[] nums) {

//         List<Integer> list = new ArrayList<>();
//         int n = nums.length;

//         for(int i = 0; i < n; i++) {

//             int count = 0;

//             for(int j = 0; j < n; j++) {

//                 if(nums[i] == nums[j]) {
//                     count++;
//                 }
//             }

//             if(count > n / 3 && !list.contains(nums[i])) {
//                 list.add(nums[i]);
//             }
//         }

//         return list;
//     }
// }
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Find two possible candidates
        for(int num : nums) {

            if(num == candidate1) {
                count1++;
            }
            else if(num == candidate2) {
                count2++;
            }
            else if(count1 == 0) {
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        count1 = 0;
        count2 = 0;

        for(int num : nums) {

            if(num == candidate1) {
                count1++;
            }

            if(num == candidate2) {
                count2++;
            }
        }

        if(count1 > nums.length / 3) {
            list.add(candidate1);
        }

        if(candidate2 != candidate1 && count2 > nums.length / 3) {
            list.add(candidate2);
        }

        return list;
    }
}