package MedicalClinicSystem;

import MedicalClinicSystem.Date;

import java.time.LocalDate;
import java.util.Random;

public class Patient extends Person implements Treatable{

    Random random = new Random();
    Date date = new Date();

    private String patientID, medicalHistory, insuranceCie;
    private int patientAge;

    public Patient(){
    super();
    patientID = "0";
    this.medicalHistory = "No medical history";
    this.insuranceCie = "No insurance cie";
    }

    public Patient(String firstName, String lastName, String gender, LocalDate dateOfBirth, String patientID, int patientAge ) {
        super(dateOfBirth, firstName, lastName, gender);
        this.medicalHistory = medicalHistory;
        this.insuranceCie = insuranceCie;
    }

    public void performTreatment(){

        boolean accepted = false;
    }

    public void displayPatient(){
        System.out.println("Patient : " + getFirstName() + " " + getLastName());
        System.out.println("Date of Birth : " + getDateOfBirth());
        System.out.println("Medical History : " + medicalHistory);
        System.out.println("Insurance Cie : " + insuranceCie);
        System.out.println("Patient ID : " + patientID);
    }

    public void displayPatientBday(){
        System.out.println("Patient : " + getFirstName() + " " + getLastName());
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
