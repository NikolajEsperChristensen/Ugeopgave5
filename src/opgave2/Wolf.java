package opgave2;

import java.util.Random;

// En ulv starter med 100 energi og trækker et tilfældigt beløb mellem 5 og 25.
public class Wolf extends Animal {
    // "static" betyder, at alle ulve deler én og samme Random.
    // Det er unødvendigt at lave en ny tilfældighedsgenerator for hver ulv.
    private static Random random = new Random();

    public Wolf(String name) {
        super(name, 100);
    }

    @Override
    public int attack() {
        // nextInt(21) giver 0-20. Plus 5 giver 5-25.
        return random.nextInt(21) + 5;
    }
}