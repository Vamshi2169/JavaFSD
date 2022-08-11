package com.in;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Products {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
    @Column(length=20)
	private String product_name;
    @Column
	private int price;
	
	public Products() {
		
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Products(int product_id, String product_name, int price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + "]";
	}
	
	
}
