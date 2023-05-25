package chess;

import chess.pieces.King;
import chess.pieces.Rook;
import tabuleiro.Position;
import tabuleiro.Tabuleiro;

public class Partida {
	
	private Tabuleiro jogBoard;

	public Partida() {
		jogBoard = new Tabuleiro(8,8);
		iSetUp();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[jogBoard.getLinha()][jogBoard.getColuna()];
		for (int i=0; i<jogBoard.getLinha(); i++ ) {
			for (int j=0; j<jogBoard.getLinha(); j++ ) {
				matrix[i][j] = (ChessPiece) jogBoard.piece(i,j);
			}
			
		}
		return matrix;
	}
	private void iSetUp() {
		jogBoard.placePiece(new Rook(jogBoard, Cor.BRANCO), new Position(0,0) );
		jogBoard.placePiece(new Rook(jogBoard, Cor.BRANCO), new Position(0,7) );
		jogBoard.placePiece(new Rook(jogBoard, Cor.BRANCO), new Position(7,0) );
		jogBoard.placePiece(new Rook(jogBoard, Cor.BRANCO), new Position(7,7) );
		jogBoard.placePiece(new King(jogBoard, Cor.BRANCO), new Position(0,4) );
		jogBoard.placePiece(new King(jogBoard, Cor.BRANCO), new Position(7,4) );
		
	}
		
	}
