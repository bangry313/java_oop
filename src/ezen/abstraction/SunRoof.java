package ezen.abstraction;

public class SunRoof {
	private String brand;
	private String color;
	
	public SunRoof() {}
	public SunRoof(String brand, String color) {
		this.brand = brand;
		this.color = color;
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
	
	public void open() {
		System.out.println(brand + " 선루프를 오픈합니다..");
	}
	
	public void close() {
		System.out.println(brand + " 선루프를 닫습니다..");
	}
}
