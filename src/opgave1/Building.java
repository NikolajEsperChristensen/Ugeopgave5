package opgave1;

import java.util.ArrayList;

// En bygning har et navn og en liste af rum.
public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Bygningen tæller ikke selv lamper. Den spørger hvert rum og lægger svarene sammen.
    public int getTotalLampCount() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getLampCount();
        }
        return total;
    }

    public int getTotalWatt() {
        int total = 0;
        for (Room room : rooms) {
            total += room.getTotalWatt();
        }
        return total;
    }

    // Printer overskriften og lader hvert rum printe sig selv
    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        for (Room room : rooms) {
            System.out.println();   // tom linje før hvert rum
            room.printRoom();
        }
    }
}