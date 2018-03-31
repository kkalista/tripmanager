package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	
	Collection<Trip> trips = new ArrayList<>();

	public boolean addTrip(Trip trip) {
		return trips.add(trip);
	}

	public boolean removeTrip(Trip trip) {
		return trips.remove(trip);
	}

	public Collection<Trip> getTrips() {
		return trips;
	}

	public void findTrip(String keyword) {

	}
}
