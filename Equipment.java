
public class Equipment {
	//Field that contains an array with the players Item objects insidoe of it
	Item[] inventory;
	//Field that contains the amount of ammunition the player has left
	int ammo;
	//Field that contains the currently active Item
	Item equipped;
	//constructor for the Equipment object. Requires no input and starts the player with nothing. Will be expanded once we have proper Item objects.
	public Equipment() {
		//Give the player 4 inventory slots
		inventory = new Item [4];
		//Give the player 10 ammo
		ammo = 10;
	}
	//Method that adds a new Item to a specified part of the inventory array. Requires both an int and an item as input. The int to determine which element of inventrory
	//to replace and the Item will be added.
	public void addItem(int element, Item newItem) {
		//Replace the specified element with the inputed Item
		inventory[element] = newItem;
	}
	//Method that removes an item in the specified part of the inventory array
	public void removeItem(int element) {
		//Remove the Item at the specified elelement
		inventory[element] = null;
	}
	//Method that returns a copy of an Item at the specified element of the inventory array
	public Item callItem(int elelement) {
		//Create a copy of the specified elelemnt
		Item copy = inventory[elelement];
		//Return the copy
		return copy;
	}
	//Method that increases the amount of ammo the player has
	public void increaseAmmo() {
		//Increment ammo by 1
		ammo++;
	}
	//Method that increases ammo by an inputted integer
	public void increaseAmmoInt (int increase) {
		//Increase ammo by the inputed integer
		ammo = (ammo + increase);
	}
	//Method that decreases the amount of ammo the player has
	public void decreaseAmmo() {
		//Decrement ammo by 1
		ammo--;
	}
	//Method that decreases ammo by an inputted integer
	public void decreaseAmmoInt (int decrease) {
		//Decrement ammo by the inputted integer
		ammo = (ammo - decrease);
	}
	//Method that returns an int equal to the amount of ammo the player has
	public int callAmmo() {
		//Create an int called copy that is equal to the amount of ammo the player has
		int copy = ammo;
		//Return copy
		return copy;
	}
	//Method that changes the currently equipped item to the designated Item
	public void equipItem (int element) {
		//Set the currently equipped Item to be a null in order to avoid potential conflicts
		equipped = null;
		//set the equipped Item to be equal to the indicated Item
		equipped = inventory[element];
	}
	//Method that returns a copy of the currently equipped Item
	public Item callEquipped () {
		//Copy the equipped Item
		Item copy = equipped;
		//Return the copy
		return copy;
	}
}
