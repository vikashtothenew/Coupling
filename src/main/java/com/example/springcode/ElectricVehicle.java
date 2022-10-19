package com.example.springcode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("Electric")
public class ElectricVehicle implements EngineType {
    public int enginePower(int power){
        System.out.println("Hi this is EV");
        return 2100;
    }
}
