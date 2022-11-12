public class DAA05Queens
{
    final int N = 8;


    void printBoard(int board[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j]+"  ");
            System.out.println();
        }
    }

    boolean isValid(int board[][], int row, int col)
    {
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (int i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (int i=row, j=col; j>=0 && i<N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    boolean solveNQueen(int board[][], int col)
    {
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            if (isValid(board, i, col) ) {
                board[i][col] = 1;
                if ( solveNQueen(board, col + 1))
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    boolean checkSolution()
    {
        int board[][] = new int[N][N];
        for(int i = 0; i<N; i++)
            for(int j = 0; j<N; j++)
                board[i][j] = 0;
        if ( solveNQueen(board, 0) == false )
        {
            System.out.println("Solution does not exist");
            return false;
        }
        printBoard(board);
        return true;
    }

    public static void main(String args[])
    {
        DAA05Queens nq = new DAA05Queens();
        nq.checkSolution();
    }
}

/*
Output :-

D:\BE\4thYear-sem7\DAA Assignments>javac NQueens.java

D:\BE\4thYear-sem7\DAA Assignments>java NQueens
1  0  0  0  0  0  0  0
0  0  0  0  0  0  1  0
0  0  0  0  1  0  0  0
0  0  0  0  0  0  0  1
0  1  0  0  0  0  0  0
0  0  0  1  0  0  0  0
0  0  0  0  0  1  0  0
0  0  1  0  0  0  0  0

D:\BE\4thYear-sem7\DAA Assignments>
*/