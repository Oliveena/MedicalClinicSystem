package MCS;

public class Treatment implements Treatable {

    /// fields members for Treatment class
    private String TreatmentID;
    private Boolean isTreatmentType;           // can be Pharmacological or Non Pharmacological
    private Date StartDate;
    private Date EndDate;
    private String PrescriberName;          // takes in first name, last name of a Dr
    private String PrescriberID;
    private Boolean coveredByInsurance;
    private Double cost;

    /// parametrized constructor for Treatment class
    public Treatment(String treatmentID, String treatmentType, Date startDate, Date endDate, String prescriberName, String prescriberID, Boolean coveredByInsurance, Double cost) {
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

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
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
}
