package application;

import java.util.Locale;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
			
	}
}
