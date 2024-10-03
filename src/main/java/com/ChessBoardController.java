package com;

import java.awt.Color;
import javax.swing.ImageIcon;

public class ChessBoardController {
    private static ImageIcon whitePawn = new ImageIcon("resources/WhitePawn.png");
    private static ImageIcon whiteKnight = new ImageIcon("resources/WhiteKnight.png");
    private static ImageIcon whiteBishop = new ImageIcon("resources/WhiteBishop.png");
    private static ImageIcon whiteRook = new ImageIcon("resources/WhiteRook.png");
    private static ImageIcon whiteQueen = new ImageIcon("resources/WhiteQueen.png");
    private static ImageIcon whiteKing = new ImageIcon("resources/WhiteKing.png");
    private static ImageIcon blackPawn = new ImageIcon("resources/BlackPawn.png");
    private static ImageIcon blackKnight = new ImageIcon("resources/BlackKnight.png");
    private static ImageIcon blackBishop = new ImageIcon("resources/BlackBishop.png");
    private static ImageIcon blackRook = new ImageIcon("resources/BlackRook.png");
    private static ImageIcon blackQueen = new ImageIcon("resources/BlackQueen.png");
    private static ImageIcon blackKing = new ImageIcon("resources/BlackKing.png");

    private Square[][] board;
    
    public ChessBoardController() {
        board = new Square[8][8];
    }

    public void createBoardSquares() {
        // Add squares with colors
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Square square;
                if ((row + col) % 2 == 0) {
                    board[row][col] = new Square(row + 1, col + 1, new Color(237, 221, 192));
                }
                else {
                    board[row][col] = new Square(row + 1, col + 1, new Color(99, 74, 28));
                }
                
            }
        }
    }

    public Square[][] getBoard() {
        return board;
    }

    public void addPieces() {
        // Add peices to starting squares ---
        
        // Pawns first
        for (int i = 0; i < 8; i++) {
            board[1][i].setPiece(new ChessPiece(PieceType.PAWN, whitePawn));
            board[6][i].setPiece(new ChessPiece(PieceType.PAWN, blackPawn));
        }
    }
}