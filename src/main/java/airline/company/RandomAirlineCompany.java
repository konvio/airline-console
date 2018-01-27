package airline.company;

import airline.aircraft.Aircraft;
import airline.aircraft.models.Helicopter;
import airline.aircraft.models.Plane;
import airline.aircraft.models.SpaceShuttle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomAirlineCompany implements AirlineCompany {

    private List<Aircraft> aircraft;

    public RandomAirlineCompany(int aircraftCount) {
        if (aircraftCount < 0) throw new IllegalArgumentException();
        
        Random random = new Random(System.currentTimeMillis());
        aircraft = new ArrayList<>(aircraftCount);
        
        for (int i = 0; i < aircraftCount; ++i) {
            String name = "Random Aircraft " + i;
            int capacity = random.nextInt(500);
            int carryingCapacity = random.nextInt(700);
            int flightRange = random.nextInt(5000);
            int fuelConsumption = random.nextInt(1000);

            Aircraft currentAircraft;
            switch(random.nextInt() % 3) {
                case 0:
                   currentAircraft = new Helicopter(name, capacity, carryingCapacity, flightRange, fuelConsumption);
                   break;
                case 1:
                   currentAircraft = new Plane(name, capacity, carryingCapacity, flightRange, fuelConsumption);
                   break;
                default:
                    currentAircraft = new SpaceShuttle(name, capacity, carryingCapacity, flightRange, fuelConsumption);
            }
            aircraft.add(currentAircraft);
        }
    }

    @Override
    public List<Aircraft> getAllAircraft() {
        return Collections.unmodifiableList(aircraft);
    } 
}