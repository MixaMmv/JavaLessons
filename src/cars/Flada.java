package cars;

import beepers.Beeper;
import cars.Car;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

public class Flada extends Car {
    public Flada(Beeper beeper, Engine engine, Transmission transmission, Door door) {
        super(beeper, engine, transmission, door);
    }

    public void Broke() {
        System.out.println("I'm broken");
    }
}
