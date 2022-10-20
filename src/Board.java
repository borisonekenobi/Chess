public class Board {
	private final boolean WHITE = true;
	private final boolean BLACK = false;
	private final Piece[][] piecesBoard = new Piece[8][8];

	public Board() {
		piecesBoard[0][0] = new Rook(BLACK);
		piecesBoard[1][0] = new Knight(BLACK);
		piecesBoard[2][0] = new Bishop(BLACK);
		piecesBoard[3][0] = new Queen(BLACK);
		piecesBoard[4][0] = new King(BLACK);
		piecesBoard[5][0] = new Bishop(BLACK);
		piecesBoard[6][0] = new Knight(BLACK);
		piecesBoard[7][0] = new Rook(BLACK);

		for (int i = 0; i < piecesBoard[0].length; i++) {
			piecesBoard[i][1] = new Pawn(BLACK);
			piecesBoard[i][6] = new Pawn(WHITE);
		}

		piecesBoard[0][7] = new Rook(WHITE);
		piecesBoard[1][7] = new Knight(WHITE);
		piecesBoard[2][7] = new Bishop(WHITE);
		piecesBoard[3][7] = new Queen(WHITE);
		piecesBoard[4][7] = new King(WHITE);
		piecesBoard[5][7] = new Bishop(WHITE);
		piecesBoard[6][7] = new Knight(WHITE);
		piecesBoard[7][7] = new Rook(WHITE);
	}

	public String toString(int posX, int posY) {
		String piece = "   ";
		if (piecesBoard[posX][posY] != null) {
			piece = piecesBoard[posX][posY].toString();
		}
		if (posX%2 == posY%2) {
			return " " + piece + " ";
		}
		return "\u001B[40m " + piece + " \u001B[0m";
	}

	public boolean isMovable(int posX, int posY, boolean color) {
		if (posX < 0 || posY < 0) return false;
		if (piecesBoard[posX][posY] == null) return false;
		if (piecesBoard[posX][posY].isWhite() != color) return false;

		return true;
	}

	public boolean isMovableTo(int movePosX, int movePosY, boolean color) {
		if (movePosX < 0 || movePosY < 0) return false;
		if (piecesBoard[movePosX][movePosY] == null || piecesBoard[movePosX][movePosY].isWhite() == color) return false;
		return true;
	}

	public void move(int piecePosX, int piecePosY, int movePosX, int movePosY) {
		piecesBoard[movePosX][movePosY] = piecesBoard[piecePosX][piecePosY];
		piecesBoard[piecePosX][piecePosY] = null;
	}
}
