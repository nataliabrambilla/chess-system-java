package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {            //Apenas o get, pois não desejamos que a cor de uma peça seja modificada (set).
		return color;
	}
	
	//CONVERTE PARA A POSIÇÃO DO XADREZ
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	//VERIFICAÇÃO DA PRESENÇA DE UMA PEÇA DO OPONENTE EM DETERMINADA POSIÇÃO
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
