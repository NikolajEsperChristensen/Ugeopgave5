package opgave2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Opret dyrene og gem dem i én liste af typen Animal.
        //    Listen kan rumme alle subklasser, fordi de alle "er" Animals.
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba"));
        animals.add(new Rabbit("Stampe"));
        animals.add(new Wolf("Ulf"));
        animals.add(new Lion("Nala"));
        animals.add(new Rabbit("Bugs"));
        animals.add(new Wolf("Akela"));

        // 2. Vis deltagerne (toString() bruges automatisk)
        System.out.println("=== Deltagere ===");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // 3. Lad dem kæmpe i par: 0 mod 1, 2 mod 3, 4 mod 5 ...
        //    i += 2 springer to frem ad gangen
        for (int i = 0; i + 1 < animals.size(); i += 2) {
            Animal a = animals.get(i);
            Animal b = animals.get(i + 1);

            System.out.println();
            System.out.println("========== " + a.getName() + " vs " + b.getName() + " ==========");

            Contest contest = new Contest(a, b);

            // Spil runder, indtil der er en vinder
            while (contest.getWinner() == null) {
                contest.playRound();
            }

            Animal winner = contest.getWinner();
            System.out.println(">>> Vinder efter " + contest.getRound() + " runder: " + winner);
        }
    }
}