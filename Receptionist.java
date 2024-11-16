package MCS;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;


public class Receptionist extends Person implements Schedulable {
    LocalDate startDateAtClinic;
    LocalDate dateOfBirth;
    private Scanner scanner = new Scanner(System.in);

    public Receptionist() {}


    // REQUIREMENT 11: SAVE AND LOAD INFORMATION ABOUT DOCTORS, PATIENTS, AND TREATMENT TO/FROM A FILE
    //----------- https://beginnersbook.com/2014/01/how-to-append-to-a-file-in-java/ -------------------
    // TODO: addTreatment()

    // method to add doctor
    public void addDoctor() {
        // Collecting doctor details from the user
        System.out.print("Enter doctor's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter doctor's last name: ");
        String lastName = scanner.nextLine();


        System.out.print("Enter doctor's specialty: ");
        String specialty = scanner.nextLine();
        System.out.print("Enter doctor's prescriber ID: ");
        String prescriberID = scanner.nextLine();

        // Creating a Doctor object
        //TODO: need to fix dateOfBirth and startDateAtClinic
        Doctor doctor = new Doctor(firstName, lastName, dateOfBirth, startDateAtClinic, specialty, prescriberID);

        // Writing the doctor information to Doctor.txt
        String doctorInfo = "\n" + doctor.getFirstName() + " " + doctor.getLastName()+
                " - Specialty: " + doctor.getSpeciality() + " - Prescriber ID: " + doctor.getPrescriberID();

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\trang_n1u0jzy\\IdeaProjects\\MCS\\MCS\\Doctor.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.write(doctorInfo);
            printWriter.close();
            System.out.println("Doctor added successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to add doctor.");
        }
    }


    // method to add patient
    public void addPatient() {
        // Collecting patient details from the user
        System.out.print("Enter patient's first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter patient's last name: ");
        String lastName = scanner.nextLine();


        System.out.print("Enter patient's medical history: ");
        String medicalHistory = scanner.nextLine();
        System.out.print("Enter patient's insurance company: ");
        String insuranceCie = scanner.nextLine();

        // Creating a Patient object
        Patient patient = new Patient(firstName, lastName, medicalHistory, insuranceCie);
        patient.setPatientID(firstName, lastName);

        // Writing the patient information to Patient.txt
        String patientInfo = "\n" + patient.getFirstName() + " " + patient.getLastName() +
                " - Medical History: " + patient.getMedicalHistory() + " - Insurance Company: " + patient.getInsuranceCie() +
                " - Patient ID: " + patient.getPatientID();

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\trang_n1u0jzy\\IdeaProjects\\MCS\\MCS\\Patient.txt", true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.write(patientInfo);
            printWriter.close();
            System.out.println("Patient added successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to add patient.");
        }
    }


    // Method to display the doctor list from Doctor.txt
    public void doctorList() {
        System.out.println("Doctor list: ");
        try {
            File file = new File("C:\\Users\\trang_n1u0jzy\\IdeaProjects\\MCS\\MCS\\Doctor.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Doctor list file not found.");
        }
    }

    // Method to display the doctor list from Doctor.txt
    public void patientList() {
        System.out.println("Patient list: ");
        try {
            File file = new File("C:\\Users\\trang_n1u0jzy\\IdeaProjects\\MCS\\MCS\\Patient.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Patient list file not found.");
        }
    }


    // TEMPORARY MENU TO TEST RECEPTIONIST
    // TODO: ENUM MENU
    public void displayMenu() {
        while (true) {
            System.out.println("\n===== Receptionist Menu =====");
            System.out.println("1. Add a new Doctor");
            System.out.println("2. Add a new Patient");
            System.out.println("3. View Doctor List");
            System.out.println("4. View Patient List");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    addPatient();
                    break;
                case 3:
                    doctorList();
                    break;
                case 4:
                    patientList();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }


    @Override
    public void scheduleAppointment() {

    }
}
