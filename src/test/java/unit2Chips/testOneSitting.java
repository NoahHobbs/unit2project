package unit2Chips;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class testOneSitting {
	ChipsMethods chM = new ChipsMethods();
	Chips chips = new Chips("Lays", 10.99, "Wavy");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_one_sitting_false() {
		//testing that I can get the return value of false from my one sitting method
		chips.setCalories(1250);
		assertFalse(chM.shouldIEatInOneSitting(chips));
	}
	
	@Test
	public void test_one_sitting_true() {
		//testing that I can get the return value of true from my one sitting method
		chips.setCalories(750);
		assertTrue(chM.shouldIEatInOneSitting(chips));
	}

}
