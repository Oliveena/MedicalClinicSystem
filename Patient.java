package MCS;

import java.util.Random;

public class Patient extends Person implements Treatable{

    Random random = new Random();
    Date date = new Date();

    private String firstName, lastName;
    //private Date dateOfBirth;
    private String medicalHistory, insuranceCie;
    private String patientID;
    private int patientAge;

    public Patient(){
    super();
    this.medicalHistory = "No medical history";
    this.insuranceCie = "No insurance cie";
    patientID = "0";
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public Patient(String firstName, String lastName, String medicalHistory, String insuranceCie) {
        super(firstName, lastName);
        this.medicalHistory = medicalHistory;
        this.insuranceCie = insuranceCie;
    }

    public void performTreatment(){

        boolean accepted = false;

    }
    public void displayPatient(){
        System.out.println("Patient : " + firstName + " " + lastName);
        //System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Medical History : " + medicalHistory);
        System.out.println("Insurance Cie : " + insuranceCie);
        System.out.println("Patient ID : " + patientID);
    }

    public void displayPatientBday(){
        System.out.println("Patient : " + firstName + " " + lastName);
        //System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Medical History : " + medicalHistory);
        System.out.println("Insurance Cie : " + insuranceCie);
        System.out.println("Patient ID : " + patientID);
//        System.out.println("Bday : " + );
    }

    public void setAge(){
        this.patientAge = date.calculateAge();
    }

    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory = medicalHistory;
    }

    public void setInsuranceCie(String insuranceCie){
        this.insuranceCie = insuranceCie;
    }

    public void setPatientID(String firstname, String lastname){
        this.patientID = firstname.charAt(0) + lastname.charAt(0) + String.valueOf(random.nextInt(100000, 999999));
    }

    public String getMedicalHistory(){
        return "Medical History for " + getFirstName() + " " + getLastName();
    }

    public String getInsuranceCie(){
        return "Insurance company for " + getFirstName() + " " + getLastName() + " is " + insuranceCie;
    }

    public String getPatientID(){
        return patientID;
    }

    public int getPatientAge(){
        return patientAge;
    }





}
