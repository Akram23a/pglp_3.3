package PGL.pglp_3_3;
/**
 * @author Akram
 */
public class RobotStatique extends Robot {
	/**
	 * @param p position
	 * @param d direction
	 */
	RobotStatique(final Position p, final Direction d) {
		super(p, d);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @throws unsupportedOperationException
	 */
	public void avance() throws unsupportedOperationException  {
		throw new unsupportedOperationException("You can't");
	}
}
