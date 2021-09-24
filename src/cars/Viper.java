package cars;

import beepers.Beeper;
import cars.Car;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

public class Viper extends Car {

    public Viper(Beeper beeper, Engine engine, Transmission transmission, Door door) {
        super(beeper, engine, transmission, door);
    }

    public void scoopFuel(){
        System.out.println("Fuel scooped");
    }

    public void landToPanet(){
        System.out.println("Vehicle landed");
    }
}
