package airline;

import org.junit.Assert;
import org.junit.Test;

import airline.company.AirlineCompany;
import airline.company.RandomAirlineCompany;

public class RandomAirlineCompanyTest {

    @Test
    public void generatesAppropriateAircraftCount() {
        int count = 435;
        AirlineCompany airline = new RandomAirlineCompany(count);
        Assert.assertTrue("Size should be equal to specified.", airline.getAllAircraft().size() == count);
    }
}