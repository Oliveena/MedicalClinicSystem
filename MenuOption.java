package MedicalClinicSystem;
// TEMPORARY MENU TO TEST RECEPTIONIST

public enum MenuOption {
    ADD_DOCTOR(1, "Add a new Doctor"),
    VIEW_DOCTOR_DETAILS(2, "View Doctor List"),
    ADD_PATIENT(3, "Add a new Patient"),
    VIEW_PATIENT_DETAILS(4, "View Patient List"),
    ADD_TREATMENT(5, "Add Treatment List"),
    VIEW_TREATMENT_DETAILS(6, "View Treatment List"),
    EXIT(7, "Exit");

    /// variables of the enum menu
    private int value;
    private String description;

    /// constructor to initialize the value and the description
    MenuOption(int userChoice, String menuItemDescription) {
        this.value = userChoice;
        this.description = menuItemDescription;
    }

    /// getters for enum
    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    /// method to get the MenuOption by its value
    /// fromInt(int i) method maps an integer to a MenuOption constant.
    /// if the input doesn't match any option, it returns null
    public static MenuOption fromInt(int i) {
        for (MenuOption option : MenuOption.values()) {
            if (option.getValue() == i) {
                return option;
            }
        }
        return null;
    }
}

