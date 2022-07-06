package org.francisca.Models;

public class CashierApplicant {
    private String applicantName;
    private int applicantAge;
    private String Qualification;

    public CashierApplicant(String applicantName, int applicantAge, String qualification) {
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
        Qualification = qualification;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }


}
