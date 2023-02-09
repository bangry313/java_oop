package ezen.abstraction;

import java.awt.Button;
import java.awt.Component;

public class CarExample {

	public static void main(String[] args) {
		SunRoof sunRoof = new SunRoof("Ezen", "검정");
		Car car = new BangryCar("루니", "방그리", false, 0, sunRoof);
		car.turnOn();
		car.run();
		car.speedUp(100);
		car.speedDown(90);
		
		BangryCar bcar = (BangryCar)car;
		bcar.sunRoofOpen();
		bcar.sunRoofClose();
		car.stop();
		car.turnOff();
		
	}

}
