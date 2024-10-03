import javax.swing.JFrame;

public class RunChess {
    public static void main(String[] args) {
        ChessBoardFrame chessBoard = new ChessBoardFrame("Chess");

        chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessBoard.setSize(1200,1200);



        // ChessBoardPanel chessPanel = new ChessBoardPanel();

        // frame.add(chessPanel);
        chessBoard.setLocationRelativeTo(null);
        chessBoard.setVisible(true);
    }
    
}