package MCS;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    // Address
    // Phone No
    // Email

    public Person(){
        this.firstName = "FirstName";
        this.lastName = "LastName";
        this.dateOfBirth = new Date();
        this.gender = "Gender";
    }

    public Person(String firstName, String lastName, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, MCS.Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date();
        this.gender = gender;
    }

    public void displayPerson(){
        System.out.println("Person : " + firstName + " " + lastName);
        System.out.println("Date of Birth : " + dateOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (firstName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (lastName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + dateOfBirth + " " + gender;
    }
}
