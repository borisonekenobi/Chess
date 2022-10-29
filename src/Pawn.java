public class Pawn extends Piece {
	public Pawn(boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♙" : "♟";
	}
}
