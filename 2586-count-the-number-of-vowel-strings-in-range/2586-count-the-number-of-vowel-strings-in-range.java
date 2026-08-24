class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left ; i <= right; i++){
            char m = words[i].charAt(0);
            char n = words[i].charAt(words[i].length()-1);
            if( ( m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u' ) && (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u')){
                count++;
            }
        }
        return count;
    }
}