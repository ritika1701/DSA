class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();
        char num;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                
                if(board[i][j]=='.'){
                    continue;
                }
                
                num=board[i][j];
                
                if(!set.add(num +" in row"+i) || !set.add(num+" in col"+j) || !set.add(num +" in row"+ i/3 +"and col"+ j/3)){
                    
                    return false;
                    
                }
            }
        }
        
        return true;
    }
}//https://leetcode.com/problems/valid-sudoku/
