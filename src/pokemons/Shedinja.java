package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Shedinja extends Nincada {
    public Shedinja(String name, int level) {
        super(name, level);
        setStats(1, 90,45, 30, 30, 40);
        setType(Type.BUG, Type.GHOST); //Заменятся ли типы
        addMove(new ShadowSneak());
    }
}