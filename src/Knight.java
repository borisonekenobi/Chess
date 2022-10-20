public class Knight extends Piece {
	public Knight(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♘" : "♞";
	}
}
