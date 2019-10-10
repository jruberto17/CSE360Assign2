/**
 * @author James Ruberto
 * Class ID: CSE 360
 * Assignment 2
 * This assignment is a basic adding machine that allows us to practice using a version control system
*/

package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String history;
	
	/**
	 * Adding Machine constructor creates an adding machine object
	 * Sets total to 0 and sets String history to "0 "
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0 ";
	}
	
	/**
	 * Method getTotal returns the total
	 * @return total is returned
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method add adds parameter value to the total and updates the history string
	 * @param value The int to be added to total
	 */
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	
	/**
	 * Method subtract subtracts parameter value from the total and updates the history string
	 * @param value The int to be subtracted from total
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	
	/**
	 * Method toString returns the history of the operations
	 * @return history is returned
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Method clear resets the total and operation history
	 */
	public void clear() {
		total = 0;
		history = "0 ";
	}
	
}
