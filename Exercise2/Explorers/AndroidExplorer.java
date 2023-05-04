package Explorers;

import Planet.Earth;
import Planet.Jupiter;
import Planet.Mars;
import Planet.Mercury;
import Planet.Neptune;
import Planet.Pluto;
import Planet.Saturn;
import Planet.Uranus;
import Planet.Venus;

public class AndroidExplorer implements Explorer{

    @Override
    public void visit(Mercury mercury) {
        System.out.println("You have been landed to Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("You have been landed to Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("You have been landed to Saturn");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("You have been landed to Earth");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("You have been landed to Pluto");
    }

    
    @Override
    public void visit(Neptune neptune) {
        System.out.println("You have been landed to Neptune");
    }

    @Override
    public void visit(Venus venus) {
        System.out.println("You have been landed to Venus");
    }

    
    @Override
    public void visit(Uranus uranus) {
        System.out.println("You have been landed to Uranus");
    }

    
    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("You have been landed to Jupiter");
    }
    
}
