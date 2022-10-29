import java.lang.reflect.Array;

public class King extends Piece {

	public King (boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♔" : "♚";
	}

	public boolean isCheck() {
		return false;
	}

	public int[][] movableSpaces (Piece[][] board) {
		int[][] spaces = new int[][] {};
		for (int i = -1; i <= 1; i++) {
			if (currentPos[0] + i < 0 || currentPos[0] + i > 7) continue;
			for (int j = -1; j <= 1; j++) {
				if (currentPos[1] + j < 0 || currentPos[1] + j > 7) continue;
				if (i == 0 && j == 0) continue;
				if (board[currentPos[0] + i][currentPos[1] + j] == null) {
					//TODO: add space to the spaces array
				}
			}
		}
		return spaces;
	}
}
