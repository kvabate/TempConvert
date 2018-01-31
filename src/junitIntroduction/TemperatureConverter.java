package junitIntroduction;
/**
 * This class implements temperature conversion between celsius and fehrenheit
 * @author kvabate
 *
 */

public class TemperatureConverter {
	
	/**
	 * This method converts from celsius to fahrenehit
	 * @param celsius is the temperature to convert (in celsius)
	 * @return is the equivalent temperature in fahrenheit
	 */
	public static double celsiusToFahrenheit(double celsius) {
		
		double fahrenheit = (9.0/5.0)*celsius + 32;
		return fahrenheit;
	}
	
	/**
	 * This method converts from fahrenehit to celsius
	 * @param fahrenheit is the temperature to convert (in fahrenheit)
	 * @return is the equivalent temerature in celsius
	 *
	 */
	public static double fahrenheitToCelsius(double fahrenheit){
		
		double celsius = (5.0/9.0)*(fahrenheit - 32);
		return celsius;
		
	}

}
