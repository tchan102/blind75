package src.validAnagram;

public class Solution {
    public boolean validAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int [] letters = new int [26];
        for(int i = 0; i < t.length(); i++){
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }
        for(int n: letters) if (n != 0) return false;

        return true;
    }
}
