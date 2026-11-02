// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         for(int i=0;i<s.length();i++){
//             String sub = "";
//             for(int j=i;j<s.length();j++){
//                 char ch = s.charAt(j);
//                 if(sub.indexOf(ch)!=-1){
//                     break;
//                 }
//                 sub += ch;
//                 max = Math.max(max, sub.length());
//             }
//         }
//         return max;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int[] seen = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            seen[ch]++;

            while (seen[ch] > 1) {
                seen[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}