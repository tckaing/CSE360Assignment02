package cse360assignment02;

/**
* The AddingMachine class implements various methods to calculate simple 
* arithmetic operations that are stored and printed upon request. The class 
* contains methods getTotal(), add(), subtract(), toString(), and clear().
* 
* @author Tina Kaing
* @version 2.0
* @since   2020-10-05 
*/


public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**
	   * The AddingMachine constructor instantiates total to 0 and history to output "0"
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	  /**
	   * The getTotal method returns the total value of the program
	   * @return stored total of program
	   */
	  public int getTotal () {
	    return 0;
	  }
	  
	  /**
	   * The add method adds the passed value to the total and 
	   * updates the history string with any arithmetic modifications
	   * @param value summed with total
	   */
	  public void add (int value) {
		  total = total + value;
		  history = history + " + " + value;
	  }

	  /**
	   * The subtract method subtracts the passed value from the total and 
	   * updates the history string with any arithmetic modifications
	   * @return value subtracted from total
	   */
	  public void subtract (int value) {
		  total = total - value;
		  history = history + " - " + value;
	  }

	  /**
	   * The toString method records all arithmetic operations in AddingMachine
	   * @return history of arithmetic operations in string format
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * The clear method resets the current value of total to 0 and history to "0"
	   */
	  public void clear() {
		  total = 0;
		  history = "0";
	  }
	}
