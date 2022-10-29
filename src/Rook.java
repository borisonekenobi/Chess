public class Rook extends Piece {
	public Rook(boolean isWhite, int[] currentPos) {
		super(isWhite, currentPos);
	}

	public String toString() {
		return isWhite ? "♖" : "♜";
	}
}
