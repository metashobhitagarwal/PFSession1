import static org.junit.Assert.*;

import org.junit.Test;


public class CheckingArrayOrderTest {

	@Test
	public void test() {
		assertArrayEquals(new int[]{2},new int[]{new Ordering().checkOrdering(new int[]{4,3,2,1})});
	}

}
