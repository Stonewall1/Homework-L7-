package task3;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        Document sdc1 = new SupplyDeliveryContract(34 , new Date(), "N2O5" , 100 );
        Document cwe1 = new ContractWithEmployee(22 , new Date() , "All-ina" , Date.from(Instant.ofEpochSecond(1700000000)));
        Document fi1 = new FinancialInvoice(7 , new Date() , 35000 , "NST440222");

        register.saveDocsToRegister(sdc1);
        register.saveDocsToRegister(cwe1);
        register.saveDocsToRegister(fi1);

        for (int i = 0; i < register.documents.length; i++) {
            if(register.documents[i] != null){
                register.showDocsInfo(register.documents[i]);
            }
        }
    }
}
