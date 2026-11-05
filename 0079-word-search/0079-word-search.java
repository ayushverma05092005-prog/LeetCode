class Solution {
    public boolean solve(char [][] board, String word, int i, int j, int itr){
        if(itr==word.length()) return true;
        if(i>=board.length || j>=board[0].length || i<0 || j<0) return false;
        if(board[i][j]!=word.charAt(itr)) return false;
        board[i][j]='.';
        boolean ans=(solve(board, word, i, j-1, itr+1) || solve(board, word, i, j+1, itr+1) || solve(board, word, i-1, j,itr+1) || solve(board, word, i+1, j,itr+1));
        board[i][j]=word.charAt(itr);
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        boolean ans=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)) ans=ans || solve(board, word, i, j, 0);
            }
        }
        return ans;
    }
}