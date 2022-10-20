public class Bishop extends Piece {
	public Bishop(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♗" : "♝";
	}
}
