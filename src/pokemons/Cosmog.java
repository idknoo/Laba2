package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Cosmog extends Pokemon {
    public Cosmog(String name, int level) {
        super(name, level);
        setStats(43, 29, 31, 29, 31, 37);
        setType(Type.PSYCHIC);
        setMove(new HealPulse(), new Scald(), new DoubleTeam(), new DazzlingGleam());
    }
}