package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	public Piece(Board board) {
		this.board = board;
		position = null;            //A posição de uma peça recém criada sempre será nula. A atribuição não é necessária, o java já entende que ela é nula.
	}
	
	protected Board getBoard() {
		return board;
	}
	
}
