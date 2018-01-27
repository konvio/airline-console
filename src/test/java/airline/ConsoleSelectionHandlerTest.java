package airline;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import airline.company.AirlineCompany;
import airline.selection.SelectionHandler;
import airline.selection.handlers.ConsoleSelectionHandler;
import airline.selection.options.MainOption;

public class ConsoleSelectionHandlerTest {

    @Mock
    AirlineCompany airline;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void shouldLaunchSomeAircraftOnOptionSelection() {
        SelectionHandler handler = new ConsoleSelectionHandler(airline, System.in, System.out);
        handler.handleMainOptionSelection(MainOption.LAUNCH_SOME);
        Mockito.verify(airline).launchSomeAircraft();
    }
}