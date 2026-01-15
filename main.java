public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupStartingPosition();

        Player white = new HumanPlayer(Color.WHITE);
        Player black = new HumanPlayer(Color.BLACK); // or new AiPlayer(Color.BLACK)

        Game game = new Game(board, white, black);
        game.start();
    }
}
