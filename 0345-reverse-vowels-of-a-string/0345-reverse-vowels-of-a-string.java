// basic idea collect the vowels in array reverse them and put them back
class Solution {
    public String reverseVowels(String s) {
        //array 
        char[] arr = s.toCharArray();
        //creating list to collect vowels
        List<Character> vowels = new ArrayList<>();
        //adding vowels to list
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                vowels.add(arr[i]);
            }
        }
        //revering the elements
        int j = vowels.size()-1;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i] = vowels.get(j);
                j--;
            }
        }
        return new String(arr);
    }
    //checking the char is vowel
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}