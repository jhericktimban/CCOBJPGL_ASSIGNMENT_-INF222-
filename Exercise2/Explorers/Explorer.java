package Explorers;

import Planet.Mercury;
import Planet.Neptune;
import Planet.Earth;
import Planet.Jupiter;
import Planet.Mars;
import Planet.Planet;
import Planet.Pluto;
import Planet.Saturn;
import Planet.Uranus;
import Planet.Venus;

public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Earth earth);

    void visit(Pluto pluto);

    void visit(Neptune neptune);

    void visit(Venus venus);

    void visit(Uranus uranus);

    void visit(Jupiter Jupiter);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
  