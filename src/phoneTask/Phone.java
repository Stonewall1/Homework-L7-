package phoneTask;

public class Phone {
    String model;
    String number;
    int weight;

    public Phone(String model, String number, int weight) {
        this(model , number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println(name + " calls");
    }
    public void receiveCall(String name , String number){
        System.out.println(name + " calls" + " Number = " + number);
    }
    public String getNumber(){
        return this.number;
    }
    public void sendMessage(String[] args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
