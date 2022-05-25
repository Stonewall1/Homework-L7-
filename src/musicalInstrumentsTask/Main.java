package musicalInstrumentsTask;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];
        Instrument Ibanez = new Guitar(6);
        Instrument Yamaha = new Drums(8);
        Instrument flute = new Flute(3);

        instruments[0] = Ibanez;
        instruments[1] = Yamaha;
        instruments[2] = flute;

        for (Instrument instrument : instruments) {
            if (instrument != null) {
                instrument.play();
            }
        }
    }
}
