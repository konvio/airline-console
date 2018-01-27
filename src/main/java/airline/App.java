package airline;

import airline.company.AirlineCompany;
import airline.company.RandomAirlineCompany;
import airline.selection.SelectionHandler;
import airline.selection.SelectionHelper;
import airline.selection.handlers.ConsoleSelectionHandler;
import airline.selection.helpers.ConsoleSelectionHelper;

public class App {

    public static void main(String[] args) {

        // A job fo DI
        AirlineCompany airline = new RandomAirlineCompany(42);
        SelectionHelper selectionHelper = new ConsoleSelectionHelper(System.in, System.out);
        SelectionHandler selectionHandler = new ConsoleSelectionHandler(airline, System.in, System.out);

        while (true) {
            selectionHandler.handleMainOptionSelection(selectionHelper.performMainOptionSelection());
        }
    }
}
