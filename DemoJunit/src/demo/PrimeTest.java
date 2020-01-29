package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Prime prime=new Prime();
		assertEquals(true,prime.primeNumberCheck(17));
	}

}
