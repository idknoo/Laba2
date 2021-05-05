package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Honedge extends Pokemon {
    public Honedge(String name, int level) {
        super(name, level);
        setStats(45, 80, 100, 35, 37, 48);
        setType(Type.GHOST, Type.STEEL);
        setMove(new Swagger(), new SwordDance());
    }
}