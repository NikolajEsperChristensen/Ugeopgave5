package opgave2;

// En kamp mellem to dyr.
public class Contest {
    // Felterne har typen Animal, ikke Lion eller Wolf.
    // Derfor kan en Contest bruges med alle slags dyr (polymorfi).
    private Animal animal1;
    private Animal animal2;
    private int round;

    public Contest(Animal animal1, Animal animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.round = 0;
    }

    public void playRound() {
        // Er kampen allerede afgjort, sker der ingenting
        if (getWinner() != null) {
            return;
        }

        round++;
        System.out.println("--- Runde " + round + " ---");

        // Dyr 1 angriber først
        strike(animal1, animal2);

        // Dyr 2 slår kun igen, hvis det stadig er aktivt
        if (animal2.isActive()) {
            strike(animal2, animal1);
        }
    }

    // Hjælpemetode, så vi ikke skriver den samme kode to gange.
    // Den er private, fordi den kun bruges inde i Contest.
    private void strike(Animal attacker, Animal defender) {
        // Her sker polymorfien: Java kalder den attack(), der hører til
        // det rigtige dyr (Lion, Wolf eller Rabbit), selvom typen er Animal.
        int damage = attacker.attack();
        defender.setEnergy(defender.getEnergy() - damage);

        System.out.println(attacker.getName() + " angriber " + defender.getName()
                + " for " + damage + "! (" + defender.getName() + " har "
                + defender.getEnergy() + " energi tilbage)");
    }

    // Returnerer vinderen, eller null hvis begge stadig er aktive
    public Animal getWinner() {
        if (animal1.isActive() && animal2.isActive()) {
            return null;            // kampen er ikke slut
        }
        if (animal1.isActive()) {
            return animal1;
        }
        return animal2;
    }

    public int getRound() {
        return round;
    }
}