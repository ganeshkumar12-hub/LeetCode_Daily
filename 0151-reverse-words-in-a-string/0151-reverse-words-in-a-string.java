class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        String reverse = "";
        for(int i=arr.length-1;i>=0;i--){
            reverse+= arr[i];
            if(i!=0){
                reverse+=" ";
            }
        }
        return reverse;
    }
}