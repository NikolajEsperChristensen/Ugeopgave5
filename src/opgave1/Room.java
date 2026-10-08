package opgave1;

import java.util.ArrayList;

// Et rum har et navn og to lister: en med lamper og en med vinduer.
public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        // Listerne skal oprettes her, ellers er de null og programmet crasher ved add()
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    // Gennemløb alle lamper og læg deres watt sammen
    public int getTotalWatt() {
        int total = 0;
        for (Lamp lamp : lamps) {
            total += lamp.getWatt();
        }
        return total;
    }

    // Samme mønster: gennemløb vinduerne og læg arealerne sammen
    public int getTotalWindowArea() {
        int total = 0;
        for (Window window : windows) {
            total += window.getAreaCm2();
        }
        return total;
    }

    public void printRoom() {
        // Ental/flertal: "1 lampe" men "2 lamper", "1 vindue" men "2 vinduer"
        String lampWord = (lamps.size() == 1) ? "lampe" : "lamper";
        String windowWord = (windows.size() == 1) ? "vindue" : "vinduer";

        System.out.println(name + " (" + lamps.size() + " " + lampWord + ", "
                + windows.size() + " " + windowWord + ")");

        // Byg en kommasepareret tekst af lamperne. toString() bruges automatisk.
        String lampText = "";
        for (int i = 0; i < lamps.size(); i++) {
            if (i > 0) {
                lampText += ", ";   // komma før alle undtagen den første
            }
            lampText += lamps.get(i);
        }
        System.out.println("  Lamper: " + lampText + " (total: " + getTotalWatt() + "W)");

        String windowText = "";
        for (int i = 0; i < windows.size(); i++) {
            if (i > 0) {
                windowText += ", ";
            }
            windowText += windows.get(i);
        }
        System.out.println("  Vinduer: " + windowText);
    }
}
