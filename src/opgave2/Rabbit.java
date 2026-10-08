package opgave2;

// En kanin angriber svagt (4), men starter med meget energi (150),
// så den kan holde ud i lang tid.
public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, 150);
    }

    @Override
    public int attack() {
        return 4;
    }
}