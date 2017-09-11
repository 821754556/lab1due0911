package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			// TODO: Make sure value of roll is between 1 and 12.
			assertEquals((int)r.getScore(),(int)1|(int)2|(int)3|(int)4|(int)5|(int)6|(int)7|(int)8|(int)9|(int)10|(int)11|(int)12);
		}

	}

}
