class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int a = word1.length();
        int b = word2.length();
        int c = 0;

        while(c < a || c < b){
            if(c < a){
                sb.append(word1.charAt(c));
            }
            if(c < b){
                sb.append(word2.charAt(c));
            }
            c++;
        }
        return sb.toString();
    }
}