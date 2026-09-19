class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxNum = candies[0]; 
        for(int i=0;i<candies.length;i++){
            if(candies[i]>maxNum){
                maxNum = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int cand = candies[i] + extraCandies;
            if(cand>=maxNum){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}