
public class Requisition {
	// Field containing the current amount of Requistion the player has. Requistion is used to procure new items/upgrades
	int amount;
	// Field containing a multiplier used to modify how much requistion the player gains after completing an action
	int modifier;
	// Constructor for the requistion object. Requires no input.
	public Requisition () {
		// When a Requistion object is created it starts with 0 value and a modifier of 0
		amount = 0;
		modifier = 1;
	}
	// Method that increases the amount of Requistion the player has based on an inputed integer and the current modifier
	public void addRequisition (int increase) {
		// Increase amount by the inputed value times the modifier
		amount += (increase * modifier);
	}
	// Method that decreases the amount of Requistion the player has
	public void decreaseRequisition (int decrease) {
		//Decrease amount by the inputed value
		amount -= decrease;
	}
	// Method that returns an integer equal to the amount of Requisition the player has
	public int callRequisition () {
		// Create a dummy value equal to amount
		int returnValue = amount;
		// Return the dummy value
		return returnValue;
	}
	// Method that allows the modifier field to be altered
	public void modifyRequisition (int newModifier) {
		// Replace the current modifier with the inputed value
		modifier = newModifier;
	}
	

}
