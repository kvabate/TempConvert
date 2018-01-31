package junitIntroduction;
import static org.junit.Assert.*;
import org.junit.Test;

public class JavaConverterTester {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testCelsiusToFahrenheit() {
		double result = TemperatureConverter.celsiusToFahrenheit(0);
		assertEquals(32.0, result, 0.0001);
	}
	
	@Test
	public void testFahrenheitToCelsius() {
		double result = TemperatureConverter.fahrenheitToCelsius(32);
		assertEquals(0, result, 0.00001);
	}
		

}
