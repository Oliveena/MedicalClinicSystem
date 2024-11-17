package MedicalClinicSystem;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class MainA {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, String> doctors = new HashMap<>();

        Doctor doctor1 = new Doctor("Genevieve", "Drapeau", LocalDate.of(1996,06, 06) , "woman", "General Practitioner", "02090");
        Doctor doctor2 = new Doctor("My Linh", "Tu", LocalDate.of(1996,06, 06),  "woman", "Obstetrician", "79552");
        Doctor doctor3 = new Doctor("Nina Marie", "Benoit", LocalDate.of(1996,06, 06),  "woman", "General Practitioner", "14318");
        Doctor doctor4 = new Doctor("Anatole", "Nguegno", LocalDate.of(1996,06, 06), "man", "Endocrinologist", "10002");
        Doctor doctor5 = new Doctor("Gerald G", "Pearl", LocalDate.of(1996,06, 06),"man", "General Surgery", "63321") ;
        Doctor doctor6 = new Doctor ("Tamara", "Yatsevska", LocalDate.of(1996,06, 06), "woman", "General Practitioner", "19460");
        Doctor doctor7 = new Doctor ("Jean-Francois", "Tremblay", LocalDate.of(1996,06, 06), "man", "Cardiologist", "08555");
        Doctor doctor8 = new Doctor ("Annie", "Tremblay", LocalDate.of(1996,06, 06), "woman", "Cardiologist", "96318");

        doctors.put(doctor1.getLastName(), doctor1.getPrescriberID());
        doctors.put(doctor2.getLastName(), doctor2.getPrescriberID());
        doctors.put(doctor3.getLastName(), doctor3.getPrescriberID());
        doctors.put(doctor4.getLastName(), doctor4.getPrescriberID());
        doctors.put(doctor5.getLastName(), doctor5.getPrescriberID());
        doctors.put(doctor6.getLastName(), doctor6.getPrescriberID());
        doctors.put(doctor7.getLastName(), doctor7.getPrescriberID());
        doctors.put(doctor8.getLastName(), doctor8.getPrescriberID());

        System.out.println("Doctors and their Prescriber IDs: ");

        doctors.forEach((lastName, prescriberID) ->
                System.out.println(lastName + " " + prescriberID));
        // last Tremblay ain't printing, go figure that out
    }
}
