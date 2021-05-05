import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Doublade( "Pokemon1", 1);
        Pokemon p2 = new Cosmog("Pokemon2", 1);
        Pokemon p3 = new AegislashBlade("Pokemon3" , 1);
        Pokemon p4 = new Honedge("Pokemon4" , 1);
        Pokemon p5 = new Nincada("Pokemon5" , 1);
        Pokemon p6 = new Shedinja("Pokemon6" , 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
