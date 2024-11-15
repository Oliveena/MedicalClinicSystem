package MCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

// SUPPOSE TO READ AND FIND DOCTORS FROM DOCTOR.TXT
// READ FROM ARRAYLIST FOR NOW

public class Receptionist extends Person implements Schedulable {
    Scanner scanner = new Scanner(System.in);
    List<Doctor> doctors;
    List<Patient> patients;
    // data members


    public Receptionist(String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }


    // ADD DOCTOR, ADD PATIENT, DISPLAY DOCTOR LIST, DISPLAY PATIENT LIST, FIND DOCTOR, FIND PATIENT


    // method to add doctor
    public void addDoctor() {
        try {
            System.out.println("Enter doctor's first name:");
            String firstName = scanner.nextLine();

            System.out.println("Enter doctor's last name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter doctor's date of birth:");
            String dateOfBirth = scanner.nextLine();

            System.out.println("Enter doctor's specialization:");
            String speciality = scanner.nextLine();

            
            // Doctor newDoctor = new Doctor(fistName, lastName, dateOfBirth, speciality);
            // doctors.add(newDoctor);
            // System.out.println("Doctor added: " + newDoctor);

        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }


    // method to add patient
    public void addPatient() {
        try {
            System.out.println("Enter patient first name:");
            String fistName = scanner.nextLine();

            System.out.println("Enter patient last name:");
            String lastName = scanner.nextLine();

            System.out.println("Enter patient's date of birth:");
            String dateOfBirth = scanner.nextLine();

            //Patient newPatient = new Patient(fistName, lastName, dateOfBirth);
            //patients.add(newPatient);
            //System.out.println("Patient added: " + newPatient);

        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }


    // method to display Doctor information
    public void displayDoctor(ArrayList<Doctor> doctors) {
        System.out.println("Display all doctors:");
        for(Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // method to display Patient Information
    public void displayPatientInformation(ArrayList<Patient> patients) {
        System.out.println("Display all patients:");
        for(Patient patient : patients) {
            System.out.println(patient);
        }
    }


    // method to find a doctor with their full name
    public void findDoctor(ArrayList<Doctor> doctors, String fistName, String lastName) {
        for(Doctor doctor : doctors) {
            if(doctor.getFirstName().equalsIgnoreCase(fistName) && doctor.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(doctor);
                return;
            }
        }
        System.out.println("Doctor not found");
    }


    // method to find a patient with their full name
    public void findPatient(ArrayList<Patient> patients,String firstName, String lastName) {
        for(Patient patient : patients) {
            if(patient.getFirstName().equalsIgnoreCase(firstName) && patient.getLastName().equalsIgnoreCase(lastName)) {
                return;
            }
        }
        System.out.println("Patient not found");
    }

    @Override
    public void scheduleAppointment() {

    }
}
