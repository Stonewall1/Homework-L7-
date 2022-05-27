package musicalInstrumentsTask;

public class Flute implements Instrument{
    int diameter;

    public Flute(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Flute with " + diameter + " diameter plays");
    }
}
