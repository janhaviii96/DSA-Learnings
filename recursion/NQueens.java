//  N-Queens problem using backtracking
public class NQueens {
    static int N = 4; // board size

    // Utility to print solution
    static void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print((board[i][j] == 1 ? "Q " : ". "));
            System.out.println();
        }
        System.out.println();
    }

    // Checking if queen can be placed
    static boolean isSafe(int board[][], int row, int col) {
        // Checking this row on left side
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1) return false;

        // Checking upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;

        // Checking lower diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1) return false;

        return true;
    }

    // Recursive utility
    static boolean solveNQUtil(int board[][], int col) {
        if (col >= N) {
            printSolution(board);
            return true;
        }

        boolean res = false;
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                res = solveNQUtil(board, col + 1) || res;
                board[i][col] = 0; // backtrack
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int board[][] = new int[N][N];
        solveNQUtil(board, 0);
    }
}

/*
Complexity:
Time: O(N!) (placing queens in N columns)
Space: O(N^2) for board + O(N) recursion stack
*/
