package PGL.pglp_3_3;
import java.util.ArrayList;
/**
 * @author Akram
 */
public class EnsembleRobots {
	ArrayList<Robot> listeRobs;
	/**
	 */
	public EnsembleRobots() {
		listeRobs = new ArrayList<Robot>();
	}
	/**
	* @param rob Robot
	*/
	public void addRobot(final Robot rob) {
		listeRobs.add(rob);
	}
	/**
	 * @throws unsupportedOperationException
	 */
	public void bougerTousRobots() throws unsupportedOperationException {
		for (Robot r: listeRobs) {
			try {
				r.avance();
			} catch(unsupportedOperationException e) {
			}
		}
	}		
}
