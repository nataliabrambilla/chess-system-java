package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

//PEÇA - REI
public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	//IMPRESSÃO DA PEÇA
	@Override
	public String toString() {
		return "K";
	}

	
}
