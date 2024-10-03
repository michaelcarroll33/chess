import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class ChessBoardFrame extends JFrame {

    public ChessBoardFrame(String title) {
        setTitle(title);
        initializeComponents();

        initializeBoardSetup();
    }

    private void initializeBoardSetup() {
        // Add squares with colors
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Square square;
                if ((row + col) % 2 == 0) {
                    square = new Square(row, col, new Color(237, 221, 192));
                }
                else {
                    square = new Square(row, col, new Color(99, 74, 28));
                }
                add(square);
            }
        }

        // Add peices to correct squares
    }

    private void initializeComponents() {
        setSize(400,400);
        setLayout(new GridLayout(8, 8));
        setResizable(false);
        
    }
}