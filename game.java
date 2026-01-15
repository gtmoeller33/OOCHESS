public class game {
    private final chessboard board;
    private final Player white;
    private final Player black;
    private Color turn = Color.WHITE;
    private boolean gameOver = false;

    public game(chessboard board, Player white, Player black) {
        this.board = board;
        this.white = white;
        this.black = black;
    }

    public void start() {
        while (!gameOver) {
            Player current = (turn == Color.WHITE) ? white : black;

            Move move = current.chooseMove(board, turn);

            if (!board.isLegalMove(move, turn)) {
                current.onInvalidMove(move);
                continue;
            }
            board.applyMove(move);

            if (board.isCheckmate(opposite(turn))) {
                System.out.println(turn + " wins by checkmate!");
                gameOver = true;
            } else if (board.isStalemate(opposite(turn))) {
                System.out.println("Draw by stalemate!");
                gameOver = true;
            } else {
                turn = opposite(turn);
            }
        }
    }

    private Color opposite(Color c) {
        return (c == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }
}
