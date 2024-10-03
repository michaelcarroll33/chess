package com;

import javax.swing.ImageIcon;

public class ChessPiece {

    private ImageIcon piece;
    private PieceType pieceType;

    public ChessPiece(PieceType type, ImageIcon pieceImage) {
        pieceType = type;
        piece = pieceImage;
    }
}