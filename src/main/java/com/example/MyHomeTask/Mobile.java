package com.example.MyHomeTask;

public class Mobile {
	private int id;
	private String brand;
	private String color;
	private int price;
	private boolean isWarranty;
	public Mobile(int id, String brand, String color, int price, boolean isWarranty) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.isWarranty = isWarranty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", isWarranty="
				+ isWarranty + "]";
	}
	
}
