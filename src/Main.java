import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import cars.Flada;
import cars.Lambo;
import cars.Viper;
import doors.Doors2d;
import doors.Doors8d;
import engines.Engine12V;
import engines.FSDEngine;
import transmissions.Automatic;
import transmissions.Manual;
import transmissions.Robot;

public class Main {

    public static void main(String[] args) {

        Horn horn = new Horn();
        FancyMusic music = new FancyMusic();
        MagicSparks magic = new MagicSparks();
        Engine12V engine12V = new Engine12V();
        Manual manual = new Manual();
        Doors8d doors8d = new Doors8d();

        Lambo lambo = new Lambo(new MagicSparks(), new Engine12V(), new Robot(), new Doors2d());
        Viper viper = new Viper(new FancyMusic(), new FSDEngine(), new Automatic(), new Doors2d());
        Flada flada = new Flada(horn, engine12V, manual, doors8d);

        System.out.println(flada.openDoors());
        System.out.println(flada.checkBeep());
        System.out.println(flada.startMove());
        System.out.println(flada.checkSpeed());
        System.out.println(flada.toListen());
        System.out.println(doors8d.flyLikeABird());
        flada.Broke();

        System.out.println(lambo.openDoors());
        System.out.println(lambo.checkBeep());
        System.out.println(lambo.startMove());
        System.out.println(lambo.checkSpeed());
        System.out.println(lambo.toListen());

        System.out.println(viper.openDoors());
        System.out.println(viper.checkBeep());
        System.out.println(viper.startMove());
        System.out.println(viper.checkSpeed());
        System.out.println(viper.toListen());

    }

}
