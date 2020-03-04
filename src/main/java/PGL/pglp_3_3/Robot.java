package PGL.pglp_3_3;

public class Robot {
	
	 Position pos; 
	 Direction dir;
	 
	 Robot(Position p, Direction d){
		 pos = new Position(p.getX(), p.getY());
		 dir = d;
	 }
	 
	 void avance() {
		 if(dir.equals(Direction.Up)) {
				this.pos.setY(1);
			}
		 	else if(dir.equals(Direction.Down)) {
				this.pos.setY(-1);
			}
			else if(dir.equals(Direction.Left)) {
				this.pos.setX(-1);
			}
			
			else {
				this.pos.setX(1);
			}
	    }
	 
	 public void tourne () {
		 
	 }
	  
}
