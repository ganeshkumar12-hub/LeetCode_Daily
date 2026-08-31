class Solution {
    public String reverseWords(String s) {
        //storing words in the array without spaces
        String arr[] = s.trim().split("\\s+");
        //result 
        String reverse = "";
        //reversing the array and stroing in result
        for(int i=arr.length-1;i>=0;i--){
            reverse+= arr[i];
            if(i!=0){
                reverse+=" ";//adding spaces btw words
            }
        }
        return reverse;//result return 
    }
}