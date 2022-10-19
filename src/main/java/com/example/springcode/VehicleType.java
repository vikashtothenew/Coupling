package com.example.springcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Petrol")
public class VehicleType {
    @Autowired
    private EngineType engineType;

    //Tight Coupling
    //ElectricVehicle eV = new ElectricVehicle();


//    //constructor
//    public VehicleType(EngineType engineType) {
//        super();
//        this.engineType = engineType;
//    }

    public int vehicleEnginePower(int power){
        int vehiclePowers = engineType.enginePower(power);
        System.out.println("vehiclePowers "+vehiclePowers);
        return 3200;
    }
}
