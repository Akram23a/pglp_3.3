package PGL.pglp_3_3;

public class Position {
	private int x;
	private int y;
	
	Position(int a, int b){
		setX(a);
		setY(b);
	}
	Position(Position P){
		setX(P.getX());
		setY(P.getY());
	}
	
	
	
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
