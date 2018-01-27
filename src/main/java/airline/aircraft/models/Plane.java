package airline.aircraft.models;

import airline.aircraft.AbstractAircraft;

public class Plane extends AbstractAircraft {

    public Plane(String name, int capacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        super(name, capacity, carryingCapacity, flightRange, fuelConsumption);
    }

    @Override
    public void launch() {
        System.out.println("Plane " + getName() + " is leaving ground...");
        System.out.println("Dear passengers, please fasten your seatbelts...");
        System.out.println("The Plane is landing...");
    }
}