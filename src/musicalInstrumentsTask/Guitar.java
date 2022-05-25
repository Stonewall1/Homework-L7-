package musicalInstrumentsTask;

public class Guitar implements Instrument{
    int stringNumber;

    public Guitar(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    @Override
    public void play() {
        if(stringNumber == 6){
            System.out.println("Guitar with " + stringNumber + " strings plays");
        }
        else if(stringNumber > 7){
            System.out.println("Better learn to play 6-string first");
        }
        else System.out.println("Seriously?");

    }
}
