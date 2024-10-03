package com;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class ChessBoardFrame extends JFrame {

    ChessBoardController controller_ = new ChessBoardController();

    public ChessBoardFrame(String title) {
        setTitle(title);
        initializeComponents();

        controller_.createBoardSquares();
        controller_.addPieces();
        addSquaresToFrame();
        
    }

    private void addSquaresToFrame() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                add(controller_.getBoard()[row][col]);
            }
        }
        
    }

    private void initializeComponents() {
        setSize(400,400);
        setLayout(new GridLayout(8, 8));
        setResizable(false);
        
    }
}