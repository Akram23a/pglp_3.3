package PGL.pglp_3_3;
/**
 * @author Akram
 */
public class Position {
	/**
	 */
	private int x;
	private int y;
	/**
	 * @param a first
	 * @param b second
	 */
	Position(final int a, final int b) {
		setX(a);
		setY(b);
	}
	/**
	 * @param p position
	 */
	Position(final Position p) {
		setX(p.getX());
		setY(p.getY());
	}
	/**
	 * @return y
	 */
	final public int getY() {
		return y;
	}
	/**
	 * @param y1 is y1
	 */
	final public void setY(final int y1) {
		this.y = y1;
	}
	/**
	 * @return x
	 */
	final public int getX() {
		return x;
	}
	/**
	 * @param x1 is x1
	 */
	final public void setX(final int x1) {
		this.x = x1;
	}
}
