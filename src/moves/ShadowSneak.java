package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowSneak extends PhysicalMove {
    public ShadowSneak() {
        super(Type.GHOST, 40, 100, 1, 1);
    }
    @Override
    protected String describe() {
        return "uses Shadow Sneak";
    }
}