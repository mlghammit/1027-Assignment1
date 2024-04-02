import lab1.Player;

public class GameBoard {
    private char[][] board;
    private int size;

    public GameBoard(int size) {
        this.size = size;
        board = new char[size][size];
        initalizeBoard();
    }

    private void initalizeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void placeToken(int row, int col, char token) {
        if (isPositionValid(row, col) && isPositionEmpty(row, col)) {
            board[row][col] = token;
        }
    }

    public boolean isPositionEmpty(int row, int col) {
        return board[row][col] == '.';
    }

    public int getSize() {
        return size;
    }

    public void displayBoard() {
        System.out.println("Game Board:");
        System.out.print("  ");
        for (int col = 0; col < size; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        for (int row = 0; row < size; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < size; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public int checkForWinDirection(Player player) {
        // checking for left-to-right
        for (int row = 0; row < size; row++) {
            int count = 0;
            for (int col = 0; col < size; col++) {
                if (board[row][col] == player.getToken()) {
                    count++;
                }
            }
            if (count == size) {
                return 1;
            }
        }
        // checkking for bottom-to top
        for (int col = 0; col < size; col++) {
            int count = 0;
            for (int row = 0; row < size; row++) {
                if (board[row][col] == player.getToken()) {
                    count++;
                }
            }
            if (count == size) {
                return 2;
            }
        }
        //check for diagonal 
        int count1 = 0;
        int count2 = 0;
    }
}
