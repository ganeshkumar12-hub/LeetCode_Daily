// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int n = cardPoints.length;
//         int max = 0;
//         for(int i=0;i<=k;i++){
//             int sum = 0;
//             for(int j=0;j<i;j++){
//                 sum+=cardPoints[j];
//             }
//             for(int j=0;j<k-i;j++){
//                 sum+=cardPoints[n-1-j];
//             }
//             max = Math.max(sum, max);
//         }
//         return max;
//     }
// }
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int tot = 0;
        for(int x:cardPoints){
            tot+=x;
        }
        if(k==n){
            return tot;
        }

        int windowSize = n-k;
        int windowSum = 0;
        for(int i=0;i<windowSize;i++){
            windowSum += cardPoints[i];
        }
        int minSum = windowSum;
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minSum = Math.min(minSum, windowSum);
        }

        return tot - minSum;
    }
}