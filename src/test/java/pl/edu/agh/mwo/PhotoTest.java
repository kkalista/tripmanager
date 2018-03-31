package pl.edu.agh.mwo;

import org.junit.Assert;
import org.junit.Test;

public class PhotoTest {

	@Test
	public void testGetComment() {
		Photo photo = new Photo();
		photo.setComment("Amazing view!");
		Assert.assertEquals("Amazing view!", photo.getComment());
	}
	
}
