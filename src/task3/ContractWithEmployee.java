package task3;

import java.util.Date;

public class ContractWithEmployee extends Document{
    String employeeName;
    Date contractEndingTime;
    public ContractWithEmployee(int documentNumber , Date documentDate , String employeeName, Date contractEndingTime) {
        this.employeeName = employeeName;
        this.contractEndingTime = contractEndingTime;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
    public ContractWithEmployee(){

    }

    @Override
    void info() {
        System.out.println("Document number = " + this.documentNumber + " Document date = " + this.documentDate +
                " Employee Name = " + this.employeeName + " Contract ends = " + this.contractEndingTime);
    }
}
