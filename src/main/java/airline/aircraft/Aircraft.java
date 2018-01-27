package airline.aircraft;

public interface Aircraft {

    /** 
     * @return non-unique name
    */
    String getName();

    /**
     * @return number of passengers
     */
    int getCapacity();

    /**
     * @return carrying capacity in kg
     */
    double getCarryingCapacity();

    /**
     * @return max flight range in km
     */
    double getFlightRange();

    /**
     * @return fuel consumption in liters/hour
     */
    double getFuelConsumption();

    /**
     * launches aircraft
     */
    void launch();
}