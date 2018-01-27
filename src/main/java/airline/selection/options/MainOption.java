package airline.selection.options;

public enum MainOption {

    CALC_CAPACITY("Calculate the total capacity of all the aircraft in the airline"),
    CALC_CARRY_CAPACITY("Calculate the carrying capacity of all the aircraft in the airline."),
    DISP_SORTED_FLIGHT_RANGE("Display the list of aircraft of the company sorted by flight range."),
    FIND_FUEL_RANGE("Find airplanes corresponding to a given range of fuel consumption parameters."),
    LAUNCH_SOME("Launch some aircraft."),
    EXIT("Exit.");

    private String description;

    private MainOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}