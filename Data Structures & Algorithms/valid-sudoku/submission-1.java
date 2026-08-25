class Solution {
    public boolean isValidSudoku(char[][] board) {
        int a, b, c;
        for (int i = 0; i < board.length; i++) {
            boolean[] row = new boolean[64];
            boolean[] column = new boolean[64];
            boolean[] chunk = new boolean[64];
            for (int j = 0; j < board.length; j++) {
                a = board[i][j];
                b = board[j][i];
                c = board[j/3 + 3*(i / 3)][j%3 + 3*(i % 3)];
                if (row[a] || column[b] || chunk[c]) return false;
                row[a] = a != '.';
                column[b] = b != '.';
                chunk[c] = c != '.';
            }
        }
        return true;
    }
}
