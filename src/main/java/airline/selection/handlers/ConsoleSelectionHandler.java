package airline.selection.handlers;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import airline.company.AirlineCompany;
import airline.selection.SelectionHandler;
import airline.selection.options.MainOption;

public class ConsoleSelectionHandler implements SelectionHandler {

    private AirlineCompany airline;
    private Scanner in;
    private PrintStream out;

    public ConsoleSelectionHandler(AirlineCompany airline, InputStream in, PrintStream out) {
        this.airline = airline;
        this.in = new Scanner(in);
        this.out = out;
    }

    @Override
    public boolean handleMainOptionSelection(MainOption option) {
        switch(option) {
            case CALC_CAPACITY:
                handleCalculateCapacity();
                break;
            case CALC_CARRY_CAPACITY:
                handleCalculateCarryCapacity();
                break;
            case DISP_SORTED_FLIGHT_RANGE:
                displaySortedByFlightRange();
                break;
            case FIND_FUEL_RANGE:
                handleDisplayByFuelRange();
                break;
            case LAUNCH_SOME:
                handleLaunchSomeAircraft();
                 break;
            case EXIT:
                handleExit();
                break;
            default:
                return false;
        }
        return true;
    }

    private void handleCalculateCapacity() {
        int capacity = airline.getTotalCapacity();
        out.println("Total Capacity: " + capacity);
    }

    private void handleCalculateCarryCapacity() {
        double capacity = airline.getTotalCarryingCapacity();
        out.println("Carrying Capacity: " + capacity);
    }

    private void displaySortedByFlightRange() {
        airline.getAllAircraft()
        .stream()
        .sorted((first , second) -> Double.compare(first.getFlightRange(), second.getFlightRange()))
        .forEachOrdered(out::println);
    }

    private void handleDisplayByFuelRange() {
        try {
            out.print("Please, specify range (min max): ");
            double min = in.nextDouble();
            double max = in.nextDouble();

            airline.getAllAircraft()
            .stream()
            .filter(a -> a.getFuelConsumption() >= min && a.getFuelConsumption() <= max)
            .forEachOrdered(out::println);
        } catch (Exception e) {
            out.println("Please, try again.");
        }
    }
    
    private void handleExit() {
        out.println("Thank you!");
        System.exit(0);
    }

    private void handleLaunchSomeAircraft() {
        airline.launchSomeAircraft();
    }
}