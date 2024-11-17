package MedicalClinicSystem;

import MedicalClinicSystem.Date;

public class Treatment implements Treatable {

    /// fields members for Treatment class
    private String TreatmentID;
    private Boolean isTreatmentType;           // can be Pharmacological or Non Pharmacological
    private MedicalClinicSystem.Date StartDate;
    private MedicalClinicSystem.Date EndDate;
    private String PrescriberName;          // takes in first name, last name of a Dr
    private String PrescriberID;
    private Boolean coveredByInsurance;
    private Double cost;

    /// parametrized constructor for Treatment class
    public Treatment(String treatmentID, String treatmentType, MedicalClinicSystem.Date startDate, MedicalClinicSystem.Date endDate, String prescriberName, String prescriberID, Boolean coveredByInsurance, Double cost) {
        TreatmentID = treatmentID;
        isTreatmentType = isTreatmentType;
        StartDate = startDate;
        EndDate = endDate;
        PrescriberName = prescriberName;
        PrescriberID = prescriberID;
        this.coveredByInsurance = coveredByInsurance;
        this.cost = cost;
    }
    
    public String getTreatmentID() {
        return TreatmentID;
    }

    public void setTreatmentID(String treatmentID) {
        TreatmentID = treatmentID;
        
        // we can implement our "student ID" code from the past group project
        // initials of prescribing Dr + initials of pt + pt DOB + 3 random numbers or something
        
    }

    public Boolean getIsTreatmentType() {
        return isTreatmentType;
    }

    public void setIsTreatmentType(boolean treatmentType) {
        isTreatmentType = treatmentType;

    }

    public MedicalClinicSystem.Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(MedicalClinicSystem.Date startDate) {
        StartDate = startDate;
    }

    public MedicalClinicSystem.Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getPrescriberName() {
        return PrescriberName;
    }

    public void setPrescriberName(String prescriberName) {
        PrescriberName = prescriberName;
    }

    public String getPrescriberID() {
        return PrescriberID;
    }

    public void setPrescriberID(String prescriberID) {
        PrescriberID = prescriberID;
    }

    public Boolean getCoveredByInsurance() {
        return coveredByInsurance;
    }

    public void setCoveredByInsurance(Boolean coveredByInsurance) {
        this.coveredByInsurance = coveredByInsurance;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public void performTreatment() {

    }

    /*
    * public void performTreatment() {

        boolean prescribed = false;

        // ideas of treatments
        //
        // Pharmacy prescription -> covered by insurance
        // OPTIONAL: we can make a BUNCH of subclasses (e.g. antibiotics, pain medication, nausea medication, etc.)

        // Verbal order -> covered by insurance
        // (aka medical advice e.g. drink hot fluids, change shampoo, avoid sunlight, etc.)
        //
        // performMinorSurgery() -> covered by insurance
        // performExamination() -> covered by insurance
        // performObstetricExamination() -> covered by insurance
        // signInsurancePapers() -> not covered by insurance
        // signAnAbsenceNote() -> not covered by insurance
        // Referral to a different specialist (optional: have general practitioners refer pts to specialist doctors) -> free, not covered by insurance
        // OPTIONAL: referral to a nurse (e.g. wound care, counseling, vaccination, etc. -> free, not covered by insurance
    }*/
}
