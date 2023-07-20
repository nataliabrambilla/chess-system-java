package boardgame;

public class Piece {
	
	protected Position position;         //Essa é uma posição simples de matriz, ela não é uma posição do xadrez.
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;                //A posição de uma peça recém criada sempre será nula. A atribuição não é necessária, o Java já entende que ela é nula.
	}
	
	protected Board getBoard() {        //Apenas o get para não permitir que o tabuleiro seja alterado (set). O Board será de uso específico da camada de tabuleiro e pela sbclasse de Piece, por isso o protected.
		return board;
	}
	
}
