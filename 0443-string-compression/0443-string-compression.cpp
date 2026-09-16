class Solution {
public:
    int compress(vector<char>& chars) {
        int num = chars.size();
        int n = 0;
        int i = 0;
        while( i < num){
            int count = 0;
            char ch = chars[i];

            while(i < num && chars[i] == ch){
                i++;
                count++;
            }
            chars[n++] = ch;

            if(count > 1){
                string s = to_string(count);
                for(char c : s){
                    chars[n++] = c;
                }
            }
        }
        return n;
    }
};