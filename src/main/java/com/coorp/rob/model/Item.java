package com.coorp.rob.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

	private String itemName;
	
	private boolean itemTaken;
	
	public Item() {
		super();
	}
	
	public void setName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getName() {
		return this.itemName;
	}

	public boolean isTaken() {
		return itemTaken;
	}

	public void setTaken(boolean itemTaken) {
		this.itemTaken = itemTaken;
	}

	@Override
	public String toString() {
		return "Item [name=" + this.itemName + ", taken=" + this.itemTaken + "]";
	}
}
