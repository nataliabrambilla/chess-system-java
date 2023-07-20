package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;      //Matriz de peças.
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");     //Tratamento de exceção personalizada.
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {                  //Sem set rows, para não ser possível alterar o tamanho do tabueiro.
		return rows;
	}

	public int getColumns() {              //Sem set columns, para não ser possível alterar o tamanho do tabueiro.
		return columns;
	}

	//RETORNAR A PEÇA ATRAVÉS DE DETERMINADAS LINHA E COLUNA
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");                                  //Tratamento de exceção personalizada.
		}
		return pieces[row][column];
	}
	//RETORNAR A PEÇA ATRAVÉS DE UMA POSIÇÃO
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");                                 //Tratamento de exceção personalizada.
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	//COLOCAÇÃO DE UMA PEÇA EM UMA POSIÇÃO DO TABULEIRO
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is alredy a piece on position " + position);          //Tratamento de exceção personalizada.
		} 
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//REMOVER UMA PEÇA DE UMA DETERMINADA POSIÇÃO
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");                               //Tratamento de exceção personalizada.
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;
	}
	
	//VERIFICAÇÃO DA EXISTÊNCIA DE UMA POSIÇÃO ATRAVÉS DE UMA LINHA E UMA COLUNA
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	//VERIFICAÇÃO DA EXISTÊNCIA DE UMA POSIÇÃO ATRAVES DE UMA POSITION
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	//VERIFICAÇÃO DA EXISTÊNCIA DE UMA PEÇA EM DETERMINADA POSIÇÃO
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");                              //Tratamento de exceção personalizada.
		}
		return piece(position) != null;
	}
}
