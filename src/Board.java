public class Board {
	private final boolean WHITE = true;
	private final boolean BLACK = false;
	private final Piece[][] piecesBoard = new Piece[8][8];

	public Board () {
		piecesBoard[0][0] = new Rook(BLACK, new int[]{0, 0});
		piecesBoard[1][0] = new Knight(BLACK, new int[]{1, 0});
		piecesBoard[2][0] = new Bishop(BLACK, new int[]{2, 0});
		piecesBoard[3][0] = new Queen(BLACK, new int[]{3, 0});
		piecesBoard[4][0] = new King(BLACK, new int[]{4, 0});
		piecesBoard[5][0] = new Bishop(BLACK, new int[]{5, 0});
		piecesBoard[6][0] = new Knight(BLACK, new int[]{6, 0});
		piecesBoard[7][0] = new Rook(BLACK, new int[]{7, 0});

		for (int i = 0; i < piecesBoard[0].length; i++) {
			piecesBoard[i][1] = new Pawn(BLACK, new int[]{i, 1});
			piecesBoard[i][6] = new Pawn(WHITE, new int[]{i, 6});
		}

		piecesBoard[0][7] = new Rook(WHITE, new int[]{0, 7});
		piecesBoard[1][7] = new Knight(WHITE, new int[]{1, 7});
		piecesBoard[2][7] = new Bishop(WHITE, new int[]{2, 7});
		piecesBoard[3][7] = new Queen(WHITE, new int[]{3, 7});
		piecesBoard[4][7] = new King(WHITE, new int[]{4, 7});
		piecesBoard[5][7] = new Bishop(WHITE, new int[]{5, 7});
		piecesBoard[6][7] = new Knight(WHITE, new int[]{6, 7});
		piecesBoard[7][7] = new Rook(WHITE, new int[]{7, 7});
	}

	public String toString (int posX, int posY) {
		String piece = "   ";
		if (piecesBoard[posX][posY] != null) {
			piece = piecesBoard[posX][posY].toString();
		}
		if (posX % 2 == posY % 2) {
			return " " + piece + " ";
		}
		return "\u001B[40m " + piece + " \u001B[0m";
	}

	public boolean isMovable (int posX, int posY, boolean color) {
		if (posX < 0 || posY < 0) return false;
		if (piecesBoard[posX][posY] == null) return false;
		if (piecesBoard[posX][posY].isWhite() != color) return false;

		return true;
	}

	public boolean isMovableTo (int movePosX, int movePosY, boolean color) {
		if (movePosX < 0 || movePosY < 0) return false;
		if (piecesBoard[movePosX][movePosY] == null || piecesBoard[movePosX][movePosY].isWhite() == color) return false;
		return true;
	}

	public void move (int piecePosX, int piecePosY, int movePosX, int movePosY) {
		piecesBoard[movePosX][movePosY] = piecesBoard[piecePosX][piecePosY];
		piecesBoard[piecePosX][piecePosY] = null;
	}
}
