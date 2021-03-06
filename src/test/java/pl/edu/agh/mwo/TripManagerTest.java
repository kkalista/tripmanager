package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
		List<Trip> trips = new ArrayList<>();
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		trips.add(trip);
		assertEquals(trips, tripManager.getTrips());
	}

	@Test
	public void testFindTripOne() {
		Trip trip = new Trip();
		trip.setName("Tenerife");
		tripManager.addTrip(trip);
		assertEquals(trip, tripManager.findTrip("Tenerife"));

	}

	@Test
	public void testFindTripZero() {
		Trip trip = new Trip();
		trip.setName("Gran Canaria");
		tripManager.addTrip(trip);
		Assert.assertNotEquals(trip, tripManager.findTrip("Tenerife"));
	}
}
