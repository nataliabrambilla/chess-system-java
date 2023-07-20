package boardgame;

public abstract class Piece {
	
	protected Position position;         //Essa é uma posição simples de matriz, ela não é uma posição do xadrez.
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;                //A posição de uma peça recém criada sempre será nula. A atribuição não é necessária, o Java já entende que ela é nula.
	}
	
	protected Board getBoard() {        //Apenas o get para não permitir que o tabuleiro seja alterado (set). O Board será de uso específico da camada de tabuleiro e pela sbclasse de Piece, por isso o protected.
		return board;
	}
	
	//MOVIMENTOS POSSÍVEIS DE UMA PEÇA 
	public abstract boolean[][] possibleMoves();
	
	//VERIFICAÇÃO SE UMA PEÇA PODE SE MOVER PARA DETERMINADA POSIÇÃO
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//VERIFICAÇÃO SE HÁ PELO MENOS UM MOVIMENTO POSSÍVEL (SE A PEÇA NÃO ESTÁ PRESA)
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
