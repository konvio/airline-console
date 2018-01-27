package airline.company;

import airline.aircraft.Aircraft;
import java.util.List;

public interface AirlineCompany {

    /**
     * @return 
     */
    List<Aircraft> getAllAircraft();
    
    /**
     * @return total sum of capacities of all aircraft
     */
    default int getTotalCapacity() {
        return getAllAircraft()
        .stream()
        .mapToInt(Aircraft::getCapacity)
        .sum();
    }

    /**
     * @return sum of carrying capacities of all aircraft
     */
    default double getTotalCarryingCapacity() {
        return getAllAircraft()
        .stream()
        .mapToDouble(Aircraft::getCarryingCapacity)
        .sum();
    }

    /**
     * calls {@link Aircraft#launch() launch} on some aircraft from {@link #getAllAircraft() getAllAircraft}
     */
    default void launchSomeAircraft() {
        long index = System.currentTimeMillis() % getAllAircraft().size();
        getAllAircraft().get((int) index).launch();
    }
}