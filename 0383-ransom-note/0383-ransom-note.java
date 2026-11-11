class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        for(char ch : ransomNote.toCharArray()){
        int idx = ch - 'a';
        freq[idx] = freq[idx] + 1;  
       }

       for(char ch : magazine.toCharArray()){
        int idx = ch - 'a';
        freq[idx] = freq[idx] - 1;
       }

       for(int i=0;i<26;i++){
        if(freq[i] > 0){
            return false;
        }
       }
       return true;
    }
}