package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

	private enum State {
		SETTING_GAME, IN_GAME;
	}

	private State state = State.SETTING_GAME;
	private Board board;

	public void printMenu() {
		System.out.println("1. Rozpocznij dla Krzy¿yków");
		System.out.println("2. Rozpocznij dla Kó³ek");
	}

	public void comandReceived(String command) {
		if (state == State.SETTING_GAME) {
			executeMenuCommand(command);
		} else if (state == State.IN_GAME) {
			executeGameCommand(command);
		}
	}

	private void executeGameCommand(String command) {
		board.fillCellByText(command);
		board.print();
	}

	private void executeMenuCommand(String command) {
		if (command.equals("1")) {
			board = new Board(Cell.CROSS);
			state = State.IN_GAME;
			System.out.println("Rozpoczyna siê rozgrywka: zaczyna Krzy¿yk");
		} else if (command.equals("2")) {
			board = new Board(Cell.CIRCLE);
			state = State.IN_GAME;
			System.out.println("Rozpoczyna siê rozgrywka: zaczyna Kó³ko");
		} else {
			System.out.println("Komenda nieznana");
		}
	}

	public static void main(String[] args) {

		Game gra = new Game();
		gra.printMenu();

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			while (line != null && !line.equals("exit")) {
				gra.comandReceived(line);
				line = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
