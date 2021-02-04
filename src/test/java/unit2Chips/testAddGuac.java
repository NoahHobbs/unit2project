package unit2Chips;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testAddGuac {
	ChipsMethods chM = new ChipsMethods();
	Chips chips = new Chips("Lays", 10.99, "Wavy");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_add_guac_yes() {
		//setting the calories under 500 so the result is a yes to guac
		chips.setCalories(300);
		String answer = chM.addGuac(chips);
		//showing one way of using assertEquals with the value directly added as a parameter
		assertEquals(answer, "Add that guac!");
	}
	
	@Test
	public void test_add_guac_no() {
		//setting calories too high for guac
		chips.setCalories(1100);
		String answer = chM.addGuac(chips);
		String expectedResult = "Maybe skip the guac";
		//showing another way with the method taking two variables instead of the value directly
		assertEquals(answer, expectedResult);
		
	}
}
