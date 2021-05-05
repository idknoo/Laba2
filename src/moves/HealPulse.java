package moves;

import ru.ifmo.se.pokemon.*;


public class HealPulse extends StatusMove {
    public HealPulse() {
        super(Type.PSYCHIC, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.HP, -2);

    }
    @Override
    protected String describe() {
        return "uses HealPulse";
    }
}



