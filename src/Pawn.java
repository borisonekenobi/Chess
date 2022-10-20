public class Pawn extends Piece {
	public Pawn(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♙" : "♟";
	}
}
