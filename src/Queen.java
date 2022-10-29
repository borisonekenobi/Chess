public class Queen extends Piece {
	public Queen(boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♕" : "♛";
	}
}
