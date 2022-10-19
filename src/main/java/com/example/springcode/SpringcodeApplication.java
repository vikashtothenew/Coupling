package com.example.springcode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringcodeApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringcodeApplication.class, args);
		VehicleType vehicleType = applicationContext.getBean(VehicleType.class);
		int vehiclePower = vehicleType.vehicleEnginePower(2200);
		System.out.println("-->>"+vehiclePower);
	}

}
