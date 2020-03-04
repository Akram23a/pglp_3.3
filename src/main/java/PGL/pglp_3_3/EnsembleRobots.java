package PGL.pglp_3_3;
import java.util.ArrayList;


public class EnsembleRobots {
	ArrayList<Robot> listeRobs;
	
	public EnsembleRobots() {
		listeRobs = new ArrayList<Robot>();
	}
	
	public void addRobot(Robot Rob) {
		listeRobs.add(Rob);
	}
	
	public void bougerTousRobots() throws unsupportedOperationException{
		
		for(Robot R: listeRobs) {
			try{
				R.avance();
			}catch(unsupportedOperationException e) {
				
			}
			}
		}
				
	}