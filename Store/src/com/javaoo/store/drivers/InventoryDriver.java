package com.javaoo.store.drivers;

import com.javaoo.store.*;

public class InventoryDriver {

	public static void main(String[] args) {
		
		Item myInventory[] = new Item[50];
		myInventory[0] = new Book("Harry Potter and the Sorcereror's Stone"
				,24.95,5,"J.K.Rowling","Scholastic","FICTION");
		
		myInventory[1] = new Book("Harry Potter and the Chamber of Secrets"
				,30.95,6,"J.K.Rowling","Scholastic","FICTION");

		
		
	}

}
