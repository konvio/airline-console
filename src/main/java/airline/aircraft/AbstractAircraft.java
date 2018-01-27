package airline.aircraft;

public abstract class AbstractAircraft implements Aircraft {

    private String name;

    private int capacity;

    private double carryingCapacity;

    private double flightRange;

    private double fuelConsumption;

    protected AbstractAircraft(String name, int capacity, double carryingCapacity, double flightRange, double fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public double getFlightRange() {
        return flightRange;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s - cap:%d carry_cap:%.2fkg range:%.2fkm fuel:%.2f lit/h", 
        getName(), 
        getCapacity(), 
        getCarryingCapacity(),
        getFlightRange(),
        getFuelConsumption());
    }
}