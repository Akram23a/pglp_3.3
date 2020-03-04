package PGL.pglp_3_3;
/**
 */
public class Robot {
	/**
	*/
	private Position pos;
	private Direction dir;
	/**
	* @param p position
	* @param d direction
	*/
	Robot(final Position p, final Direction d) {
		 pos = new Position(p.getX(), p.getY());
		 dir = d;
	} 
	/**
	 * @throws unsupportedOperationException
	 */
	void avance() throws unsupportedOperationException {
		 if (dir.equals(Direction.Up)) {
				this.pos.setY(this.pos.getY() + 1);
			} else if (dir.equals(Direction.Down)) {
				this.pos.setY(this.pos.getY() - 1);
			} else if (dir.equals(Direction.Left)) {
				this.pos.setX(this.pos.getX() - 1);
			} else {
				this.pos.setX(this.pos.getX() + 1);
			}
	    }
	 /**
	 */
	 public void tourne() {
		 if (dir.equals(Direction.Up)) {
				this.dir = Direction.Right;
			} else if (dir.equals(Direction.Left)) {
				this.dir = Direction.Up;
			} else if (dir.equals(Direction.Right)) {
				this.dir = Direction.Down;
			} else {
				this.dir = Direction.Left;
			}
	}
	 /**
	  * @return position
	  */
	 final public Position getPos() {
		 return pos;
	 }
	 /**
	  * @return direction
	  */
	 final public Direction getDir() {
		 return dir;
	 }
	 /**
	  * @param p Position 
	  */
	 public void setPos(final Position p) {
		 pos.setX(p.getX());
		 pos.setY(p.getY());
	 }
	 /**
	  * @param d Direction
 	  */
	 public void setPos(final Direction d) {
		 dir = d;
	 }
}
