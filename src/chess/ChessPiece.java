package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{
	
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {            //Apena o get, pois não desejamos que a cor de uma peça seja modificada (set).
		return color;
	}

}
