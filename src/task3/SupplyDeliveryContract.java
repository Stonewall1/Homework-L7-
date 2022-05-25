package task3;

import java.util.Date;

public class SupplyDeliveryContract extends Document{
    String supplyType;
    int supplyAmount;
    public SupplyDeliveryContract(int documentNumber , Date documentDate , String supplyType, int supplyAmount) {
        this.supplyType = supplyType;
        this.supplyAmount = supplyAmount;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
    public SupplyDeliveryContract(){

    }

    @Override
    void info() {
        System.out.println("Document number = " + this.documentNumber + " Document date = " + this.documentDate +
                           " Supply type = " + this.supplyType + " SupplyAmount = " + this.supplyAmount);
    }
}
