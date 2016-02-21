/** 
 * This class a simplified Calculator. It supports four arithmetic operations:
 * addition, subtraction, multiplication, and division. Every time an operation
 * is performed, it is stored in the history, and can be retrieved via the
 * history() method. 
 * 
 * @author Miguel Deniz Lopez     PIN: 301     CSE360 Spring 2016
 */

package cse360assign3;

public class Calculator {

	private int total;

	/**
	 * Creates a Calculator object that can perform 4 arithmetic operations:
	 * addition, subtraction, multiplication, and division. Additionally, each
	 * arithmetic operation gets stored in the history.
	 * 
	 * @param none
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * Returns the cumulative total of all arithmetic operations.
	 * 
	 * @return (int) The cumulative total
	 */
	public int getTotal() {
		return 0;
	}

	/**
	 * Adds the given parameter value to the cumulative total.
	 * 
	 * @param value
	 *            The value to add to the total
	 */
	public void add(int value) {

	}

	/**
	 * Subtracts the given parameter value from the cumulative total.
	 * 
	 * @param value
	 *            The value to subtract from the total
	 */
	public void subtract(int value) {

	}

	/**
	 * Multiplies the cumulative total by the parameter value.
	 * 
	 * @param value
	 *            The value to multiply the total by
	 */
	public void multiply(int value) {

	}

	/**
	 * Divides the cumulative total by the parameter value.
	 * 
	 * @param value
	 *            The value to divide the total by
	 */
	public void divide(int value) {

	}

	/**
	 * Returns a string of the arithmetic operations performed
	 * 
	 * @return (String) The string containing all arithmetic operations
	 *         performed
	 */
	public String getHistory() {
		return "";
	}
}
