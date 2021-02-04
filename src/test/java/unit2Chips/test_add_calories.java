package unit2Chips;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test_add_calories {
	ChipsMethods chM = new ChipsMethods();
	Chips chips = new Chips("Lays", 10.99, "Wavy");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_add_calories_succeed() {
		// this test is for the addCalories class to ensure that the calories are being added if the starting calorie is low enough
		chips.setCalories(200);
		chM.addCalories(chips);
		int totalCal = chips.getCalories();
		assertEquals(totalCal, 450);
	}
	
	@Test
	public void test_add_calories_not_adding() {
		//just making sure that the calories don't just add no matter what
		chips.setCalories(600);
		chM.addCalories(chips);
		int totalCal = chips.getCalories();
		assertEquals(totalCal, 600);
	}
	

}
