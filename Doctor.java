package MCS;

import java.time.LocalDate;

public class Doctor extends Person {

    /// fields specific to Doctor class
    private String speciality;
    private String prescriberID;
        // is a number 12345678

    /**
     * parametrized constructor
     * @param firstName
     * @param lastName
     * @param dateOfBirth
     * @param speciality
     * @param prescriberID
     */
    public Doctor(String firstName, String lastName, LocalDate dateOfBirth, String speciality, String prescriberID) {
        super(firstName, lastName, dateOfBirth);
        this.speciality = speciality;
        this.prescriberID = prescriberID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPrescriberID() {
        return prescriberID;
    }

    // regex tutorial https://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
    // a prescriber ID can only contain 8 digits
    public void setPrescriberID(String prescriberID) {
        if (prescriberID.isEmpty()) {
            throw new IllegalArgumentException("Prescriber ID cannot be empty");
        } else if (prescriberID.matches("\\d{4,9}")) {
            throw new IllegalArgumentException("Prescriber ID must be between 4 and 9 numbers. Please omit slashes, hyphens or whitespaces.");
        }
        this.prescriberID = prescriberID;
    }


// methods specific to Doctor class
    // to implement once Billing is created

// can be also applied to optional class Nurse
// public void prescribeTreatment() {
//        if (treatment = pharmacologicalTreatment) {
//            bill = 150;
//        } else if (treatment = nonPharmacologicalTreatment) {
//            bill = 100;
//        }
//    }
//
//    public void performMinorSurgery() {
//        bill += 350;
//    }
//
//    public void performExamination() {
//        bill += 200;
//    }
//
//    public void performObstetricExamination() {
//        bill += 950;
//    }
//
//    public void signInsurancePapers() {
//        bill += 75;
//    }
//
//    public void signAnAbsenceNote() {
//        bill += 20;
//    }

}
