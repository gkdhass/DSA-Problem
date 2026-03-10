class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> n = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char num = board[i][j];
                if(num != '.'){
                    if(!n.add(num + "in row" + i) || 
                       !n.add(num + "in col" + j) ||    
                       !n.add(num + "in box" + (i/3)*3 + (j/3)))
                       {
                        return false;
                }
                }
            }
        }
        return true;
    }
}
