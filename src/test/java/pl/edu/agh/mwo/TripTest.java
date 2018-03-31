package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class TripTest {

	@Test
	public void testAddName() {
		Trip trip = new Trip();
		trip.setName("Spain");
		Assert.assertEquals("Spain", trip.getName());
	}

	@Test
	public void testAddDescription() {
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

	@Test
	public void testGetPhotos() {
		Collection<Photo> photos = new ArrayList<>();
		Trip trip = new Trip();
		Photo photo = new Photo();
		trip.addPhoto(photo);
		photos.add(photo);
		Assert.assertEquals(photos, trip.getPhotos());
	}
}
