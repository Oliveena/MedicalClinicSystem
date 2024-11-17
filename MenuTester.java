/*
* Things we gotta review as per project instructions:
* - are there default constructors for every class? (bottom of page 8/10)
*
* - "Provide a getter method only if you want the data field to be readable, and provide a setter method only if you want the data to be updatable"
* We have provided getters/setters for everything lol (top of page 9/10)
*
* - "Do not declare a data field that can be derived from other data fields. E.g. age can be derived from dateOfBirth, so it should not be declared in a separate data field.:"
* We have declared EVERYTHING. (middle of page 9/10)
*
* - customise classes thru properties and methods (middle of page 9/10)
*
* - "Always reference static variables and methods using the class name (e.g. Class.getterOfSomeSortBlaBla() ) rather than by reference variable" (middle of page 9/10)
*
* - modeling stuff as per Inheritance vs Aggregation (end of page 9/10)
*
*
*
* */
package MedicalClinicSystem;

import java.util.Scanner;

public class MenuTester {
    public static void main(String[] args) {

        /// importing the scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== Receptionist Menu =====");

        /// associating user choice and menu value
        while (true) {
            // print menu options
            for (MenuOption option : MenuOption.values()) {
                System.out.println(option.getValue() + ". " + option.getDescription());

            }// get user input
            System.out.print("\nPlease choose an action: ");
            int choice = scanner.nextInt();

            // handle the choice using enhanced switch
            MenuOption selectedOption = MenuOption.fromInt(choice);

            if (selectedOption == null) {
                System.out.println("Invalid option. Please try again");
                continue;   // Invalid input, loop again
            }

            // use enhanced switch
            switch (selectedOption) {
                case ADD_DOCTOR -> System.out.println("Add a new Doctor...");
                case ADD_PATIENT -> System.out.println("Add a new Patient...");
                case VIEW_DOCTOR_DETAILS -> System.out.println("Display Doctor Info...");
                case VIEW_PATIENT_DETAILS -> System.out.println("Display Patient Info...");
                case ADD_TREATMENT -> System.out.println("Add a new Treatment...");
                case VIEW_TREATMENT_DETAILS -> System.out.println("View Treatment Details...");
                case EXIT -> System.out.println("Exiting the Medical Clinic System...");        //  call method Exit() down below
                }
            }
        }

        // method for option 7, Exit()
        public static void Exit(Scanner scanner){
            System.out.println("""
                    
                    Would you like to exit?
                    
                    1 -> Exit;
                    2 -> Return to main page;
                    """);
            int exit = scanner.nextInt();
            switch (exit) {
                case 1:
                    System.out.println("Thank you for using our address book. Goodbye!");
                    scanner.close();
                    return;

                case 2:
                    System.out.println("Coming back to the main menu: ");
                    // return to Main menu
                    break;
                default:
                    System.out.println("Please choose one of the options above.");
                    //continue;

            }
        }
    }
