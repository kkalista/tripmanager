package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TripTest {

	@Test
	public void testGetName() {
		Trip trip = new Trip();
		trip.setName("Spain");
		Assert.assertEquals("Spain", trip.getName());
	}

	@Test
	public void testGetDescription() {
		Trip trip = new Trip();
		trip.setDescription("First Trip Abroad");
		Assert.assertEquals("First Trip Abroad", trip.getDescription());
	}

	@Test
	public void testAddPhoto() {
		Trip trip = new Trip();
		Photo photo = new Photo();
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}

	/*@Test
	public void testGetPhotos() {
		Photo photo = new Photo();
		Trip trip = new Trip();
		trip.addPhoto(photo);
		Assert.assertEquals(photo, trip.getPhotos());
	}*/
}
