package task3;

import java.util.Date;

public class FinancialInvoice extends Document{
    double finalMonthSum;
    String departmentCode;
    public FinancialInvoice(int documentNumber , Date documentDate , double finalMonthSum, String departmentCode) {
        this.finalMonthSum = finalMonthSum;
        this.departmentCode = departmentCode;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }
    public FinancialInvoice(){

    }

    @Override
    void info() {
        System.out.println("Document number = " + this.documentNumber + " Document date = " + this.documentDate +
                " Month Sum = " + this.finalMonthSum + " Department Code = " + this.departmentCode);
    }
}
