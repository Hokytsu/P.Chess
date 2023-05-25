package chess.pieces;

import chess.ChessPiece;
import chess.Cor;
import tabuleiro.Tabuleiro;

public class King extends ChessPiece{

	public King(Tabuleiro board, Cor cor) {
		super(board, cor);
	}
	@Override
	public String toString() {
		return "K";
	}

}
