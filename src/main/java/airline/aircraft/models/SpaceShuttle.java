package airline.aircraft.models;

import airline.aircraft.AbstractAircraft;

public class SpaceShuttle extends AbstractAircraft {

    public SpaceShuttle(String name, int capacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        super(name, capacity, carryingCapacity, flightRange, fuelConsumption);
    }

    @Override
    public void launch() {
        System.out.println("Shuttle " + getName() + " is leaving Earth...");
        System.out.println("Dear passengers, please do not feed aliens!");
        System.out.println("Landing on another planet...");
    }
}