public class Piece {
	protected boolean isWhite;
	protected int[] currentPos;

	public Piece(boolean isWhite, int[] currentPos) {
		this.isWhite = isWhite;
		this.currentPos = currentPos;
	}

	public boolean isWhite() {
		return this.isWhite;
	}

	public int[][] movableSpaces(Piece[][] board) {
		return new int[][] {};
	}
}
