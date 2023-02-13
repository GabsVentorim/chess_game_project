package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition sourse = UI.readChessPosition(in);
			
			boolean[][] possibleMoves = chessMatch.possibleMoves(sourse);
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces(), possibleMoves);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(in);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(sourse, target);
		
			}
			catch(ChessException e){
				System.out.println(e.getMessage());
				in.nextLine();
			}
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				in.nextLine();
			}
		}
	}
}
