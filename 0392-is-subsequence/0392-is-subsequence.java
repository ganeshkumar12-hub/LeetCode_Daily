class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        for(int i=0;i<s.length();i++){
            boolean found = false;
            while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}