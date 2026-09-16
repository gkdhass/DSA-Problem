class Solution {
public:
    bool isValid(string s) {
        stack<char> ch;

        for(char c : s){
            if(!ch.empty() && c == ')' && ch.top() == '('){
                ch.pop();
            }
            else if(!ch.empty() && c == ']' && ch.top() == '['){
                ch.pop();
            }
           else if(!ch.empty() && c == '}' && ch.top() == '{'){
                ch.pop();
            }
            else{
                ch.push(c);
            }
        } 
        return ch.empty();
    }
};