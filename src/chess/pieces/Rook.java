package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//PEÇA - TORRE
public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	//IMPRESSÃO DA PEÇA
	@Override
	public String toString() {
		return "R";
	}
	
	

}
