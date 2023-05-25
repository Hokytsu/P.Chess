package chess;

import tabuleiro.Piece;
import tabuleiro.Tabuleiro;

public class ChessPiece extends Piece {

	private Cor cor;

	public ChessPiece(Tabuleiro board, Cor cor) {
		super(board);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	} 
	
	
	
}
