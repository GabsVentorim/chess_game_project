package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition sourse = UI.readChessPosition(in);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(in);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(sourse, target);
		}

	}
}
