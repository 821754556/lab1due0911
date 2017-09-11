package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			assertEquals((int)d.getDieValue(),(int)1|(int)2|(int)3|(int)4|(int)5|(int)6);
			// TODO: Make sure value of die is between 1 and 6.
		}

	}

}
