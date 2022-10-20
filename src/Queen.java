public class Queen extends Piece {
	public Queen(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♕" : "♛";
	}
}
