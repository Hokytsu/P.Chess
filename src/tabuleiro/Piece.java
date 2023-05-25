package tabuleiro;

public class Piece {
	
	protected Position ps; 
	private Tabuleiro board;
	
	public Piece(Tabuleiro board) {
		this.board = board;
		
		
	}

	protected Tabuleiro getBoard() {
		return board;
	}
	
	
}
