package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testSum() {
		TripManager tm = new TripManager();
		assertEquals(8, tm.sum(4, 4));
	}

}
