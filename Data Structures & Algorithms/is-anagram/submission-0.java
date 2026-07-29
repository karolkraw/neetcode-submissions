class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] occurrences = new int[26];
       
        for (char x: s.toCharArray()) {
            occurrences[x - 'a']++;
        }

        for (char x: t.toCharArray()) {
            occurrences[x - 'a']--;
        }

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] != 0)
                return false;
        }

        return true;
        
    }
}
