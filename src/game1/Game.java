package game1;

public class Game {

	public Board board;
	public Circle circle;
	public Cross cross;
	
	
	public Game(Board board, Circle circle, Cross cross) {
		this.board = board;
		this.circle = circle;
		this.cross = cross;
	}
	
	public static void main(String[] args) {
		
	}

	public String toString() {
		return "Game [board=" + board + ", circle=" + circle + ", cross="
				+ cross + "]";
	}
	
	
	
	
}
