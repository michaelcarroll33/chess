package com;

import java.awt.Color;
import javax.swing.JPanel;

public class Square extends JPanel {
    
    private Color color_;
    private int row_;
    private int col_;
    private ChessPiece piece_;
    private boolean occupied_;
    private boolean selectable_;
    private boolean highlighted_;

    public Square(int rowNum, int colNum, Color backColor) {
        row_ = rowNum;
        col_ = colNum;
        color_ = backColor;

        initializeComponents();
    }

    public Color getColor() {
        return color_;
    }

    public int getRow() {
        return row_;
    }

    public int getCol() {
        return col_;
    }

    public ChessPiece getPiece() {
        return piece_;
    }

    public boolean isOccupied() {
        return occupied_;
    }

    public boolean isSelectable() {
        return selectable_;
    }

    public boolean isHighlighted() {
        return highlighted_;
    }

    private void initializeComponents() {
        setBackground(color_);
    }

    public void setPiece(ChessPiece p) {
        piece_ = p;
    }
}
