package ezen.abstraction;

public class BangryCar extends Car {
	
	private SunRoof sunRoof;

	public BangryCar() {}

	public BangryCar(String name, String model, boolean status, int speed, SunRoof sunRoof) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
		this.sunRoof = sunRoof;
	}

	public SunRoof getSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(SunRoof sunRoof) {
		this.sunRoof = sunRoof;
	}

	@Override
	public void turnOn() {
		System.out.println("방그리 부릉부릉~~");
		
	}

	@Override
	public void turnOff() {
		System.out.println("방그리 스르르~~");
	}

	@Override
	public void run() {
		speed = 1;
		System.out.println("방그리 "+speed+" 스피드로 달립니다..");
		
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed; 
		System.out.println("방그리 "+speed+" 스피드로 달립니다..");
		
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed; 
		System.out.println("방그리 "+speed+" 스피드로 달립니다..");
		
	}

	@Override
	public void stop() {
		System.out.println("방그리 멈춰!!!");
	}
	
	// 추가된 기능
	public void sunRoofOpen() {
		sunRoof.open();
	}
	
	public void sunRoofClose() {
		sunRoof.close();
	}

}
