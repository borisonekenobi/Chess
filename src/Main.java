import java.util.Scanner;

public class Main {
	private static final boolean WHITE = true;
	private static final boolean BLACK = false;

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Board board = new Board();
		int turn = 0;
		boolean turnColor = WHITE;
		while (true) {
			turn++;
			int[] pos;
			int[] movePos;
			do {
				printBoard(board);
				if (turn % 2 == 0) {
					System.out.print("BLACK TURN, Select piece to move: ");
					turnColor = BLACK;
				} else {
					System.out.print("WHITE TURN, Select piece to move: ");
					turnColor = WHITE;

				}
				String piece = input.nextLine();
				pos = convertInput(piece);
			} while (!board.isMovable(pos[0], pos[1], turnColor));

			do {
				System.out.print("Select where to move piece: ");
				String move = input.nextLine();
				movePos = convertInput(move);
			} while (!board.isMovableTo(movePos[0], movePos[1], turnColor));
			board.move(pos[0], pos[1], movePos[0], movePos[1]);
		}
	}

	private static void printBoard(Board board) {
		System.out.println("    A    B    C    D    E    F    G    H");
		for (int i = 0; i < 8; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < 8; j++) {
				System.out.print(board.toString(j, i));
			}
			System.out.println();
		}
	}

	private static int[] convertInput(String input) {
		String[] splitInput = input.split("");
		int x = -1;
		int y = -1;

		switch (splitInput[0].toUpperCase()) {
			case "A" -> x = 0;
			case "B" -> x = 1;
			case "C" -> x = 2;
			case "D" -> x = 3;
			case "E" -> x = 4;
			case "F" -> x = 5;
			case "G" -> x = 6;
			case "H" -> x = 7;
		}

		try {
			y = Integer.parseInt(splitInput[1]) - 1;
		} catch (Throwable err) {
			System.out.println("\u001B[31mIncorrect Input!\u001B[0m");
		}
		return new int[] {x, y};
	}
}