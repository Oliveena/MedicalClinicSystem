package MedicalClinicSystem;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Appointment {
    // data members
    private static List<Appointment> appointments = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private Doctor doctor;
    private Patient patient;
    private LocalDate appointmentDate;


    // default constructor
    public Appointment() {}

    // constructor with parameters
    public Appointment(Doctor doctor, Patient patient, LocalDate appointmentDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
    }


    // method to schedule appointment
    public void scheduleAppointment() {
        // prompt user for input

        // doctor details
        System.out.print("Enter doctor's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter doctor's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter doctor's date of birth: ");
        String dateOfBirth = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
        System.out.println("Enter doctor's gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter doctor's specialty: ");
        String speciality = scanner.nextLine();
        System.out.print("Enter doctor's prescriber ID: ");
        String prescriberID = scanner.nextLine();


        Doctor doctor = new Doctor(firstName, lastName, birthDate, gender, speciality, prescriberID);
        String doctorInfo = "\n" + doctor.getFirstName() + " " + doctor.getLastName() + " - Date of Birth: " + doctor.getDateOfBirth() + " - Gender: " + gender +
                " - Specialty: " + doctor.getSpeciality() + " - Prescriber ID: " + doctor.getPrescriberID();

        // patient details
        System.out.println("Enter patient first name: ");
        String patientFirstName = scanner.nextLine();
        System.out.println("Enter patient last name: ");
        String patientLastName = scanner.nextLine();

        // appointment date details
        System.out.println("Enter appointment date: ");
        String appointmentDate = scanner.nextLine();
    }

    // method to modify appointment
    public void modifyAppointment() {
        // determine which element of the appointment we want to modify

    }

    // method to cancel an appointment
    public void cancelAppointment() {
        // remove appointment from the Collection that stores appointments

    }
}
