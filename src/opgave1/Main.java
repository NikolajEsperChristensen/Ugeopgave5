package opgave1;

public class Main {
    public static void main(String[] args) {
        // 1. Opret bygningen
        Building building = new Building("Kontorbygningen");

        // 2. Opret rummene og fyld lamper og vinduer i
        Room meetingRoom = new Room("Mødelokale");
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(100));
        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(120, 90));

        Room kitchen = new Room("Køkken");
        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));
        kitchen.addWindow(new Window(60, 60));

        Room office = new Room("Kontor");
        office.addLamp(new Lamp(100));
        office.addLamp(new Lamp(80));
        office.addLamp(new Lamp(60));
        office.addWindow(new Window(150, 100));

        // 3. Sæt rummene ind i bygningen
        building.addRoom(meetingRoom);
        building.addRoom(kitchen);
        building.addRoom(office);

        // 4. Print bygningen
        building.printBuilding();

        // 5. Svar på spørgsmålene
        System.out.println();
        System.out.println("Total: " + building.getTotalLampCount() + " lamper, "
                + building.getTotalWatt() + "W");
    }
}