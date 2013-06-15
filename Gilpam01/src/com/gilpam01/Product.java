package com.gilpam01;

public class Product {
	int image;
	String id;
	String name;
	String uom;
	double price;
	boolean selected = false;
	
	public int getImage(){
		return image;
	}

	public String getID(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getUOM(){
		return uom;
	}
	public double getPrice(){
		return price;
	}
	
	public void setImage(int image){
		this.image=image;
	}
	
	public void setID(String id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setUOM(String uom){
		this.uom=uom;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setSelected(boolean selected) {
	  	  this.selected = selected;
	}
	public boolean isSelected(){
		return selected;
	}

}
