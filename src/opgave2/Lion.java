package opgave2;

// En løve starter med 80 energi og trækker altid 20.
// "extends Animal" betyder, at Lion arver alt fra Animal (navn, energi, isActive, toString...).
public class Lion extends Animal {

    public Lion(String name) {
        // super(...) kalder Animals konstruktør. Det SKAL være første linje.
        super(name, 80);
    }

    // @Override fortæller compileren, at vi udfylder den abstrakte metode fra Animal
    @Override
    public int attack() {
        return 20;
    }
}