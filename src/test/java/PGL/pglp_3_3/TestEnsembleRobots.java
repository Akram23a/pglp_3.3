package PGL.pglp_3_3;

public class TestEnsembleRobots {
	
	
	public void TestBougerTousRobots() throws unsupportedOperationException {
		Robot A=new Robot(new Position(3,2),Direction.Right);
		Robot B=new Robot(new Position(1,5),Direction.Left);
		Robot C=new Robot(new Position(3,2),Direction.Up);
		Robot D=new RobotStatique(new Position(1,2),Direction.Down);

		A.avance();
		B.avance();
		C.avance();
		D.avance();

		assert(A.pos.getX()==4);
		assert(A.pos.getX()==2);
		assert(A.pos.getY()==3);
		assert(A.pos.getY()==2);

		
	}
}
