package pl.edu.agh.mwo;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	TripManager tripManager;

    @Before
    public void setupTest() {
        tripManager = new TripManager();
    }
    
	@Test
	public void testAddTrip() {
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		assertEquals(1, tripManager.getTrips().size());	
	}
	
	@Test
	public void testRemoveTrip() {
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		tripManager.removeTrip(trip);
		assertEquals(0, tripManager.getTrips().size());
	}

	@Test
	public void testGetTrips() {

	}

	@Test
	public void testFindTrip() {

	}
}
