class Solution {
    public int countSeniors(String[] s) {
       int count = 0;
       for(String c : s){
        int age = Integer.parseInt(c.substring(11,13));
        if(age > 60){
            count++;
        }
       }
       return count;
    }
}