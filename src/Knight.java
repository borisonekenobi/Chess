public class Knight extends Piece {
	public Knight(boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♘" : "♞";
	}
}
