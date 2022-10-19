package com.example.springcode;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Petrol")

public class PetrolVehicle {
    public int enginePower(int power){
        System.out.println("Hi this is Petrol");
        return 2500;
    }
}
