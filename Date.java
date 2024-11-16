// HELLO WORLD
package MCS;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import static MCS.MainA.scanner;

    public class Date {
        /**
         * declaring fields of Date
         */
        private LocalDate birthday;
        private LocalDate startDate;
        // private LocalDate endDate; for when a doctor leaves the clinic
        private LocalDate startOfTreatment;
        private LocalDate endOfTreatment;
        private int yearsOfExperience;
        private int age, day, month, year;


        public Date(){

        }
        /**
         * parametrized constructor for fields
         *
         * @param dateOfBirth
         */
        public Date(LocalDate dateOfBirth, int yearsOfExperience, int age, LocalDate startDate, LocalDate startOfTreatment, LocalDate endOfTreatment) {
            this.birthday = dateOfBirth;
            this.yearsOfExperience = yearsOfExperience;
            this.age = calculateAge();
            // add other constructors for fields
        }
        public void displayMonth(){
            System.out.println("""
                \t1 -> January 31
                \t2 -> February 28
                \t3 -> March 31
                \t4 -> April 30
                \t5 -> May 31
                \t6 -> June 30
                \t7 -> July 31
                \t8 -> August 31
                \t9 -> September 30
                \t10 -> October 31
                \t11 -> November 30
                \t12 -> December 31
                """);

        }


        public void setBirthday() {
            boolean validDay = false;
            System.out.println("Enter your Year of Birth: ");
            year = scanner.nextInt();
            while(year < 1900 || year > 2024){
                System.out.println("Enter values between 1900 and 2024");
                year = scanner.nextInt();
            }
            displayMonth();
            System.out.println("Enter your Month of Birth (1-12 ): ");
            month = scanner.nextInt();
            while (month < 1 || month > 12){
                System.out.println("Enter values between 1 and 12");
                month = scanner.nextInt();
            }
            System.out.println("Enter your Day of birth: ");
            day = scanner.nextInt();
            while (!validDay){
                switch(month){
                    case 1, 3, 5, 7, 8, 10, 12:
                        while(day <= 0 || day > 31) {
                            System.out.println(Month.of(month) + " has 31 days.");
                            System.out.println("Input value between 1 and 31 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;

                    case 4, 6, 9, 11:
                        while(day <= 0 || day > 30) {
                            System.out.println(Month.of(month) + " has 30 days.");
                            System.out.println("Input value between 1 and 30 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;

                    case 2:
                        while(day <= 0 || day > 28) {
                            System.out.println(Month.of(month) + " has 28 days.");
                            System.out.println("Input value between 1 and 28 only: ");
                            day = scanner.nextInt();
                        }
                        validDay = true;
                        break;
                } // switch
            } // loop
        }

        public int getYear(){
            return year;
        }

        public int getMonth(){
            return month;
        }

        public int getDay(){
            return day;
        }

        /**
         * method for calculating age, where (age) = (current date) - (dateOfBirth)
         *
         * @return
         */
        public int calculateAge() {
            // tutorial found here
            // https://www.geeksforgeeks.org/how-to-calculate-age-from-a-birthdate-using-java-date-time/

            // get a date of birth from values above
//        LocalDate dateOfBirth = LocalDate.of(this.year, this.month, this.day);

            // get today's date
//        LocalDate currentDate = LocalDate.now();

            // calculating time elapsed between dateOfBirth and today
            Period period = Period.between(LocalDate.now(), LocalDate.of(year, month, day));
            // removing the negative from the number
            return Math.abs(period.getYears());
        }

        /**
         * getter for age in years
         *
         * @return
         */
        public int getAge() {
            return age;
        }

        public String getBirthday() {
            return birthday.toString();
        }

        /**
         * getter for the entire birthday date
         *
         * @return
         */
        public String printBirthday() {
            return String.format("%02d/%02d/%d", day, month, year);
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public LocalDate getStartOfTreatment() {
            return startOfTreatment;
        }

        public void setStartOfTreatment(LocalDate startOfTreatment) {
            this.startOfTreatment = startOfTreatment;
        }

        public LocalDate getEndOfTreatment() {
            return endOfTreatment;
        }

        public void setEndOfTreatment(LocalDate endOfTreatment) {
            this.endOfTreatment = endOfTreatment;
        }

        public void setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        }

        private int calculateYearsOfExperience() {
            Period period = Period.between(this.startDate, LocalDate.now());
            return Math.abs(period.getYears());
        }

        //
//    /**
//     * method for printing out a person's birthday
//     */
//    // printing out the birthday
//    public void printBirthday() {
//        System.out.printf("\n\tThe entered birth date is: %02d/%02d/%d", birthday.getMonthValue(), birthday.getDayOfMonth(), birthday.getYear());
//    }

//

    }


