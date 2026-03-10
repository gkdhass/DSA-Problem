class Solution {
    public int scoreOfString(String s) {
        int count = 0;
        int len = s.length()-1;
        for(int i=0; i<len; i++){
            count += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return count;
    }
}