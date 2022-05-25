package phoneTask;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Xiaomi" , "3452277" , 120);
        Phone phone2 = new Phone("Iphone" , "6868949" , 100);
        Phone phone3 = new Phone("Samsung" , "7775533" , 130);
        System.out.print(phone1.model + " ");
        System.out.print(phone1.number + " ");
        System.out.println(phone1.weight);
        System.out.print(phone2.model + " ");
        System.out.print(phone2.number + " ");
        System.out.println(phone2.weight);
        System.out.print(phone3.model + " ");
        System.out.print(phone3.number + " ");
        System.out.println(phone3.weight);

        phone1.receiveCall("Nasty");
        String number = phone1.getNumber();
        System.out.println(number);

        phone2.receiveCall("Dmitry" , phone2.getNumber());

        phone3.sendMessage(new String[]{"7774532" , "38789383" , "23783878" , "3983939"});

    }
}
