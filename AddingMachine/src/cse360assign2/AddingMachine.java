package cse360assign2;

public class AddingMachine
{
	private int total;
	
	/**
	 * The AddingMachine constructor creates an AddingMachine object
	 * that holds a running tally in the total variable
	 */
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * The getTotal method returns the current value stored in the
	 * total variable of the AddingMachine object
	 * 
	 * @return the current total
	 */
	public int getTotal () 
	{
		return 0;
	}
	
	/**
	 * The add method adds number stored in the parameter 
	 * value to the value of the variable total
	 * 
	 * @param value Holds the value to be added to the running total
	 */
	public void add (int value) 
	{
		
	}
	
	/**
	 * The subtract method subtracts the value stored in the parameter
	 * value from the value of the variable total
	 * 
	 * @param value Holds the value to be subtracted from the running total
	 */
	public void subtract (int value) 
	{
		
	}
	
	/**
	 * The toString method prints a history of all additions and subtractions made
	 * to the running total in order
	 * 
	 * @return A string of all past operations performed
	 * 
	 */
	public String toString () 
	{
		return "";
	}

	/**
	 * The clear method resets the running total to zero and deletes the history
	 * of operations performed on the running total
	 */
	public void clear() 
	{
	
	}
}
