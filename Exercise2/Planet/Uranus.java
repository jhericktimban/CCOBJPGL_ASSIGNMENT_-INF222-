package Planet;

import Explorers.Explorer;

public class Uranus implements Planet{

    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
    
}