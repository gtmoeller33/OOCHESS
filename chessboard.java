public class chessboard {
    private final piece[][] squares = new piece[8][8];

    public void setupStartingPosition() {
        // pawns
        for (int file = 0; file < 8; file++) {
            squares[6][file] = new Pawn(Color.WHITE);
            squares[1][file] = new Pawn(Color.BLACK);
        }

        // rooks
        squares[7][0] = new Rook(Color.WHITE);
        squares[7][7] = new Rook(Color.WHITE);
        squares[0][0] = new Rook(Color.BLACK);
        squares[0][7] = new Rook(Color.BLACK);

        // knights
        squares[7][1] = new Knight(Color.WHITE);
        squares[7][6] = new Knight(Color.WHITE);
        squares[0][1] = new Knight(Color.BLACK);
        squares[0][6] = new Knight(Color.BLACK);

        // bishops
        squares[7][2] = new Bishop(Color.WHITE);
        squares[7][5] = new Bishop(Color.WHITE);
        squares[0][2] = new Bishop(Color.BLACK);
        squares[0][5] = new Bishop(Color.BLACK);

        // queens
        squares[7][3] = new Queen(Color.WHITE);
        squares[0][3] = new Queen(Color.BLACK);

        // kings
        squares[7][4] = new King(Color.WHITE);
        squares[0][4] = new King(Color.BLACK);
    }

    // stubs you’ll implement
    public boolean isLegalMove(Move move, Color turn) { return true; }
    public void applyMove(Move move) {}
    public boolean isCheckmate(Color side) { return false; }
    public boolean isStalemate(Color side) { return false; }
}
