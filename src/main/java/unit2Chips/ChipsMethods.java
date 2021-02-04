package unit2Chips;

public class ChipsMethods {
	
	public boolean shouldIEatInOneSitting(Chips chips) {
		boolean oneSitting = false;
		int calorieCount = chips.getCalories();
		if (calorieCount < 1000) {
			oneSitting = true;
		} else {
			oneSitting = false;
		}
		return oneSitting;
	}
	
	public String addGuac(Chips chips) {
		String answer = "";
		int calorieCount = chips.getCalories();
		if (calorieCount <= 500) {
			answer = "Add that guac!";
		} else {
			answer = "Maybe skip the guac";
		}
		return answer;
	}
	public int addCalories(Chips chips) {
		String guacOrNah = addGuac(chips);
		int amtOfCal = chips.getCalories();
		int totalCalories = 0;
		int extraCalories = 0;
		if (guacOrNah == "Add that guac!") {
			extraCalories += 250;
			
		}
		totalCalories = amtOfCal + extraCalories;
		chips.setCalories(totalCalories);
		return totalCalories;
	}
}
