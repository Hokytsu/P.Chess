package chess.pieces;

import chess.ChessPiece;
import chess.Cor;
import tabuleiro.Tabuleiro;

public class Rook extends ChessPiece{

	public Rook(Tabuleiro board, Cor cor) {
		super(board, cor);
		
	}
	@Override
	public String toString() {
		return "R";
	}

}
