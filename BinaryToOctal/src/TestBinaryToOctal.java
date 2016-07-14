import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestBinaryToOctal {

	@Test
	public void test() {
		assertEquals(65,new BinaryToOctalClass().convertBinaryToOctal(110101));
	}

}
