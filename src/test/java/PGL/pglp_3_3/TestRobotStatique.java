package PGL.pglp_3_3;

public class TestRobotStatique {
	public void TestAvance() throws unsupportedOperationException {
		Robot A=new Robot(new Position(3,2),Direction.Right);
		A.avance();
		assert(A.pos.getX()==3);
		
	}
}
