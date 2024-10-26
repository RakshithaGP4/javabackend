package com.basics;
class Product{
	int productId;
	String productName;
	
	Product(int id,String name){
		productId=id;
		productName=name;
	}
	Product(Product p){
		productId=p.productId;
		productName=p.productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
}

public class Constructor_V {

	public static void main(String[] args) {
		Product p= new Product(101,"laptop");
		System.out.println(p);
		Product p2= new Product(p);
		System.out.println(p2);
			
	}

}
