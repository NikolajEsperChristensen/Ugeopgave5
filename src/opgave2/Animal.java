package opgave2;

// Superklassen for alle dyr.
// Den er "abstract", fordi et "dyr i almindelighed" ikke findes i konkurrencen.
// Man kan ikke skrive new Animal(...), kun new Lion(...), new Wolf(...) osv.
public abstract class Animal {
    // "protected" ville give subklasserne direkte adgang. Vi bruger private
    // og lader alle gå gennem getters/setters, så energien altid kontrolleres.
    private String name;
    private int energy;

    public Animal(String name, int energy) {
        this.name = name;
        setEnergy(energy);   // brug setteren, så reglen om "ikke under 0" også gælder her
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    // Energien må aldrig blive negativ. Går den under 0, sættes den til 0.
    public void setEnergy(int energy) {
        if (energy < 0) {
            this.energy = 0;
        } else {
            this.energy = energy;
        }
    }

    // Et dyr er med i konkurrencen, så længe det har energi tilbage
    public boolean isActive() {
        return energy > 0;
    }

    // Abstrakt metode: ingen krop her. Hver subklasse SKAL selv skrive den.
    // Det giver mening, fordi der ikke findes et "standard-angreb" for et dyr.
    public abstract int attack();

    // getClass().getSimpleName() giver navnet på den rigtige klasse,
    // fx "Lion", selvom metoden står i Animal.
    @Override
    public String toString() {
        return getClass().getSimpleName() + " \"" + name + "\" (energi: " + energy + ")";
    }
}