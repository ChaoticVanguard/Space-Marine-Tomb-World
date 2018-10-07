import java.awt.Point;

public class Quartermaster {
	//Field that will contain the various items for sale in the shop
	Item[] inventory;
	//Field that will contain the various powerups for sale in the shop
	String[] powerups;
	//Field that defines the price of an item. Currently consists of only a single int. Will be replaced with a better system in the future.
	int price;
	//Field that will contain the coordinates for a supply beacon. Purchased items will spawn at the beacons coordinates
	Point beacon;
	//Default constructor for the quartermaster. Requires no inputs. Will eventually ber replaced with a better constructor when we have proper items
	public Quartermaster() {
		
	}
	//Method that creates a new item at the supply beacons location. Takes in the location of a specific element in the inventory array in order to decide
	//which item to create. Also takes in the amount of Requisition the player has
	//Returns a message regarding whether the player had enough Requistiton to purchase the item
	public String requestItem(int whichItem, Requisition player) {
		//Check if the player has enough Requisition to purchase the item
		if (player.callRequisition() >= price) {
			//If the player has enough Requisition decrement their Requisition and return a String stating their purchase was succesful
			player.decreaseRequisition(price);
			return "Purchase Complete";
		}
		//If they lacked enough Requisition then return a statement saying their purchase was not completed
		else {
			return "You require more Requisition gas";
		}
	}
	//Method which removes an item from the inventory array. Takes in an int indicating which element should be removed
	public void removeItem(int element) {
		//Sets the indicated element in the array to equal null
		inventory[element] = null;
	}
	//Method which adds a new Item to a specified slot in the inventory array. Takes in an Item object and an int indicating which slot should be replaced
	//Prefferably empty the slot with removeItem before using this method
	public void addItem(int element, Item newItem) {
		//Set the indicated element to equal the inputed Item
		inventory[element] = newItem;
	}
	//Method which returns a copy of an item located in the inventory array. An inputed int determines which Item is copied and returned
	public Item callItem(int element) {
		//Create an Item called Copy and make it equal the indicated Item in the inventory Array
		Item copy = new Item();
		copy = inventory[element];
		//Return the copied item
		return copy;
	}

	
}
