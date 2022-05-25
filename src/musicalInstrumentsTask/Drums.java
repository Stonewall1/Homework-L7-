package musicalInstrumentsTask;

public class Drums implements Instrument{
    int size;

    public Drums(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Drums with " + size + " size plays");
    }
}
