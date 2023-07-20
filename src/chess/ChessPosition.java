package chess;

import boardgame.Position;

//CONVERSÃO DA POSIÇÃO MATRIZ PARA CHESSPOSITION
public class ChessPosition {
	
	private char column;
	private int row;
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are frm a1 t h8.");              //Tratamento de exceção personalizada.
		}
		this.column = column;
		this.row = row;
	}
	public char getColumn() {                      //Sem set column, para não ser possível alterar o tamanho do tabueiro.  
		return column;
	}
	
	public int getRow() {                          //Sem set rows, para não ser possível alterar o tamanho do tabueiro.
		return row;
	}
	
	//CONVERSÃO O CHESSPOSITION PARA POSITION(MATRIZ)
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	//CONVERSÃO DE POSITION (MATRIZ) PAEA CHESSPOSITION
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	//IMPRESSÃO DA POSIÇÃO
	@Override
	public String toString() {
		return "" + column + row;             //"" para forçar o compiladoor a entender que é uma concatenação de strings.
	}

	
}
