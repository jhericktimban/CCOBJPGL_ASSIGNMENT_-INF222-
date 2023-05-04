import Explorers.AndroidExplorer;
import Explorers.Explorer;
import Explorers.HumanExplorer;
import Explorers.RobotExplorer;
import Planet.Earth;
import Planet.Jupiter;
import Planet.Mars;
import Planet.Mercury;
import Planet.Neptune;
import Planet.Planet;
import Planet.Pluto;
import Planet.Saturn;
import Planet.Uranus;
import Planet.Venus;



public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet earth = new Earth();
        Planet pluto = new Pluto();
        Planet neptune = new Neptune();
        Planet venus = new Venus();
        Planet uranus = new Uranus();
        Planet jupiter = new Jupiter();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();
        Explorer landed = new AndroidExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        earth.accept(astronaut);
        pluto.accept(astronaut);
        neptune.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);
        jupiter.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        earth.accept(rover);
        pluto.accept(rover);
        neptune.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);
        jupiter.accept(rover);

        mars.accept(landed);
        saturn.accept(landed);
        mercury.accept(landed);
        earth.accept(landed);
        pluto.accept(landed);
        neptune.accept(landed);
        venus.accept(landed);
        uranus.accept(landed);
        jupiter.accept(landed);

    }
}