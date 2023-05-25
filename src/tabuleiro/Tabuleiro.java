package tabuleiro;

public class Tabuleiro {	
	private int linha, coluna;
	private Piece[][] pieces;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pieces = new Piece[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna; 
	}
	
	public Piece piece(int linha, int coluna) {
		return pieces[linha][coluna];
	}
	public Piece piece(Position position) {
		return pieces[position.getLinha()][position.getColuna()];
	}
	public  void placePiece(Piece piece, Position position) {
		pieces[position.getLinha()][position.getColuna()] = piece;
		piece.ps = position;
		
		
	}
}
