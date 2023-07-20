package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	//ATUALIZAR OS VALORES DE UMA POSIÇÃO
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//IMPRIMIR A POSIÇÃO NA TELA
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
