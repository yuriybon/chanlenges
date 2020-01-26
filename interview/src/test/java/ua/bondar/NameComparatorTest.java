package ua.bondar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameComparatorTest {

	@Test
	public void compareNames() {
		double d = NameComparator.compareName("bosco", "bosco");
		assertTrue(d == 1.0d);
	}
	
	@Test
	public void compareNames2Words() {
		double d = NameComparator.compareName("bosco liga", "bosco lidia");
		assertTrue(d >= 0.5d);
	}

	@Test
	public void compareNames3Words() {
		double d = NameComparator.compareName("bosco ligia", "bosco ligia moja");
		assertTrue(d >= 0.5 && d < 1.0 );
	}

	@Test
	public void compareNames3Words1() {
		double d = NameComparator.compareName("bosco ligia", "bosco lidia moja");
		assertTrue(d >= 0.1 && d < 1 );
	}

	
	@Test
	public void compareNames3Words2() {
		double d = NameComparator.compareName("bosco ligia lidia", "bosco lidia moja");
		assertTrue("result ="+d,d >= 0.5 && d < 1 );
	}
	
	@Test
	public void compareNames3Words3() {
		double d = NameComparator.compareName("bosco ligia lidia", "bosco lidia augustin");
		assertTrue(d >= 0.25 && d < 0.7 );
	}

}
