package lesson11;

public class Board {

	private Cell[][] table = new Cell[3][];
	
	public Board(){
		table[0] = new Cell[3];
		table[1] = new Cell[3];
		table[2] = new Cell[3];
		table[0][0] = Cell.CROSS;
		table[0][1] = Cell.CIRCLE;
		table[0][2] = Cell.CIRCLE;
		table[1][0] = Cell.CROSS;
		table[1][1] = Cell.CIRCLE;
		table[1][2] = Cell.CROSS;
		table[2][0] = Cell.CROSS;
		table[2][1] = Cell.CROSS;
		table[2][2] = Cell.CIRCLE;
	}
	
	
	
	public static void main(String[] args) {
		
		Board board = new Board();

		board.print();
		
		
	}

	
	public void print() {
		System.out.println("*****");
		for(int i = 0; i < 3; i++){
			System.out.print("*");
			for(int j = 0; j < 3; j++){
				char c = cellToChar(table[i][j]) ; 
				System.out.print(c);
			}
			System.out.println("*");
		}
		System.out.println("*****");
		
		System.out.println();
		
		System.out.println("The winner is: ");
		
		
	}
	public static char cellToChar(Cell cell){
		
		if(cell == null){
			return '-';
		}
		if(cell == Cell.CIRCLE){
			return 'O';
		}
		else {
			return 'X';
		}
		/*!!!!! jaka metoda !!!!!!!
		 */
	}


		/*if(table[0][0] == Cell.CROSS && table[0][1] == Cell.CROSS && table[0][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[1][0] == Cell.CROSS && table[1][1] == Cell.CROSS && table[1][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[2][0] == Cell.CROSS && table[2][1] == Cell.CROSS && table[2][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[0][0] == Cell.CROSS && table[1][0] == Cell.CROSS && table[2][0] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[0][1] == Cell.CROSS && table[1][1] == Cell.CROSS && table[2][1] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[1][2] == Cell.CROSS && table[1][2] == Cell.CROSS && table[2][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		if(table[0][0] == Cell.CROSS && table[0][1] == Cell.CROSS && table[0][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[0][0] == Cell.CROSS && table[1][1] == Cell.CROSS && table[2][2] == Cell.CROSS ) {
			return 'Cross!';
		}
		
		if(table[0][2] == Cell.CROSS && table[1][1] == Cell.CROSS && table[2][0] == Cell.CROSS ) {
			return 'Cross!';
		}*/
	}
	
}

