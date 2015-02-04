package game1;

public class Board {

	
	public int thickness;
	public int field;
	public int width;
	public int height;
	
	
	public Board(int thickness, int field, int width, int height){
		
		this.thickness = thickness;
		this.field = field;
		this.width = width;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
		
	}

	public String toString() {
		return "Board [thickness=" + thickness + ", field=" + field
				+ ", width=" + width + ", height=" + height + "]";
	}
	

	
	
}
