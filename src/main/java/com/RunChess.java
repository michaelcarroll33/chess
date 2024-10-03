package com;

import javax.swing.JFrame;

public class RunChess {
    public static void main(String[] args) {

        // ChessBoardController controller = new ChessBoardController();
        ChessBoardFrame chessBoard = new ChessBoardFrame("Chess");

        chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chessBoard.setSize(1200,1200);
        chessBoard.setLocationRelativeTo(null);

        chessBoard.setVisible(true);
        
    }
    
}