package opgave1;

// Et vindue har en bredde og en højde i centimeter.
public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    // Arealet regnes ud hver gang i stedet for at blive gemt i et felt.
    // Så kan det aldrig komme ud af trit med bredde og højde.
    public int getAreaCm2() {
        return widthCm * heightCm;
    }

    // Printes som fx "120x90cm"
    @Override
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}