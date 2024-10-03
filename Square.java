import java.awt.Color;

import javax.swing.JPanel;

public class Square extends JPanel {
    
    private Color color;
    private int row;
    private int col;
    private ChessPiece piece;
    private boolean occupied;
    private boolean selectable;
    private boolean highlighted;

    public Square(int rowNum, int colNum, Color backColor) {
        row = rowNum;
        col = colNum;
        color = backColor;

        initializeComponents();
    }

    public Color getColor() {
        return color;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public boolean isHighlighted() {
        return highlighted;
    }

    private void initializeComponents() {
        setBackground(color);
    }
}
