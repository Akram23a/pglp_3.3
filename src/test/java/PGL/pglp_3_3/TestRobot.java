package PGL.pglp_3_3;

import org.junit.Test;

public class TestRobot {

	@Test
	public void TestAvance() throws unsupportedOperationException {
		Robot A=new Robot(new Position(3,2),Direction.Right);
		A.avance();
		assert(A.pos.getX()==4);
		
	}
	
	public void TestTourne() {
		Robot A=new Robot(new Position(3,2),Direction.Right);
		A.tourne();
		assert(A.dir==Direction.Down);

	}
}
