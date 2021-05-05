package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends SpecialMove {
    public AerialAce() {
        super(Type.FLYING, 60, Integer.MAX_VALUE);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return (accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION)) > Math.random();
    }

    @Override
    protected String describe() {
        return "uses AerialAce";
    }
}








