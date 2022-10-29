public class Bishop extends Piece {
	public Bishop(boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♗" : "♝";
	}
}
