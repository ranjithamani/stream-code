package com.xworkz.stream.dto;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

import com.xworkz.stream.dto.constants.GroceryType;

public class GroceryDTO implements Serializable{

	private String name;
	private String brand;
	private double price;
	private GroceryType type;
	private  double quantity;
	private boolean quality;
	private  boolean organic;
	private boolean veg;
	private long barCodeNo;
	private Date expiryDate;
	private Date manufacturedDate;
	
	public GroceryDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public GroceryDTO(String name, String brand, double price, GroceryType type, double quantity, boolean quality,
			boolean organic, boolean veg, long barCodeNo, Date expiryDate, Date manufacturedDate) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.organic = organic;
		this.veg = veg;
		this.barCodeNo = barCodeNo;
		this.expiryDate = expiryDate;
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", type=" + type + ", quantity="
				+ quantity + ", quality=" + quality + ", organic=" + organic + ", veg=" + veg + ", barCodeNo="
				+ barCodeNo + ", expiryDate=" + expiryDate + ", manufacturedDate=" + manufacturedDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryDTO other = (GroceryDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GroceryType getType() {
		return type;
	}

	public void setType(GroceryType type) {
		this.type = type;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public long getBarCodeNo() {
		return barCodeNo;
	}

	public void setBarCodeNo(long barCodeNo) {
		this.barCodeNo = barCodeNo;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
}

	