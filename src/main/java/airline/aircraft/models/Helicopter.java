package airline.aircraft.models;

import airline.aircraft.AbstractAircraft;

public class Helicopter extends AbstractAircraft {

    public Helicopter(String name, int capacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        super(name, capacity, carryingCapacity, flightRange, fuelConsumption);
    }

    @Override
    public void launch() {
        System.out.println("Launching helicopter " + getName() + "...");
        System.out.println("What a beautiful skies!...");
        System.out.println("The helicopter successfully landed.");
    }
}