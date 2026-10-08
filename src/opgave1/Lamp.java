package opgave1;

// En lampe har en effekt (watt) og kan være tændt eller slukket.
public class Lamp {
    // Felterne er private, så de kun kan ændres via klassens egne metoder (indkapsling)
    private int watt;
    private boolean isOn;

    // Konstruktøren kaldes, når vi skriver: new Lamp(60)
    public Lamp(int watt) {
        this.watt = watt;   // "this.watt" er feltet, "watt" er parameteren
        this.isOn = false;  // En ny lampe starter altid slukket
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    // Getter, så Room kan lægge watt sammen uden at røre feltet direkte
    public int getWatt() {
        return watt;
    }

    public boolean isOn() {
        return isOn;
    }

    // toString bestemmer, hvordan lampen ser ud, når den printes, fx "60W"
    @Override
    public String toString() {
        return watt + "W";
    }
}
