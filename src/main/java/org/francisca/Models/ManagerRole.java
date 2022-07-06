package org.francisca.Models;

public class ManagerRole {
private CashierApplicant hireCashier;

public ManagerRole(){

}
    public ManagerRole(CashierApplicant cashierApplicant) {
        this.hireCashier = cashierApplicant;
    }

    public CashierApplicant getHireCashier() {
        return hireCashier;
    }

    public void setHireCashier(CashierApplicant hireCashier) {
        this.hireCashier = hireCashier;
    }

    public String canHire() {
    String output = " ";
        if (hireCashier.getApplicantAge() < 18 || hireCashier.getApplicantAge() > 30 || hireCashier.getQualification() != "OND") {
            output ="Sorry you are not hired";

        }

        else {output = "Congratulation! you have been hired";}

        return output;

    }


}
