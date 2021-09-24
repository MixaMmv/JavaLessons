package cars;

import beepers.Beeper;
import cars.Car;
import doors.Door;
import engines.Engine;
import transmissions.Transmission;

public class Lambo extends Car {

    public Lambo(Beeper beeper, Engine engine, Transmission transmission, Door door) {
        super(beeper, engine, transmission, door);
    }

}
