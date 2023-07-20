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

	//MOVIMENTOS POSSÍVEIS DO REI
	@Override
	public boolean[][] possibleMoves(){
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
