public class King extends Piece {
	public King(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♔" : "♚";
	}

	public boolean isCheck() {
		return false;
	}
}
