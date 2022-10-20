public class Rook extends Piece {
	public Rook(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public String toString() {
		return isWhite ? "♖" : "♜";
	}
}
