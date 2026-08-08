class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row;
        Set<Character> column;
        for (int i = 0; i < board.length; i++) {
            row = new HashSet<>();
            column = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (row.contains(board[i][j])) return false;
                    row.add(board[i][j]);
                }
                if (board[j][i] >= '1' && board[j][i] <= '9') {
                    if (column.contains(board[j][i])) return false;
                    column.add(board[j][i]);
                }
            }
        }
        Set<Character> chunk;
        for (int h = 0; h < board.length; h += 3) {
            for (int i = 0; i < board.length; i += 3) {
                chunk = new HashSet<>();
                for (int j = h; j < h + 3; j++) {
                    for (int k = i; k < i + 3; k++) {
                        if (board[j][k] >= '1' && board[j][k] <= '9') {
                            if (chunk.contains(board[j][k])) return false;
                            chunk.add(board[j][k]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
