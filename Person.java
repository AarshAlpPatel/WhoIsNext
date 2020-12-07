/**
* @author Aarsh Patel
* @version 1.0
* This class represents the Person object.
*/
public class Person {
	private String name;
	private String month;
	private int count;

	/**
	* 3-arg constructor
	* @param name represents the name of the person
	* @param month represents the last time a person did a task
	* @param count represents the amount of times the person completed a task
	*/
	public Person(String name, String month, int count) {
		this.name = name;
		this.month = month;
		this.count = count;
	}

	/**
	* 2-arg constructor that assumes the person never did the task
	* @param name represents the name of the person
	* @param month represents the last time/thing the person did
	*/
	public Person(String name, String month) {
		this(name, month, 0);
	}

	/**
	* Getter for Name
	* @return name
	*/
	public String getName() {
		return this.name;
	}

	/**
	* Getter for Month
	* @return month
	*/
	public String getMonth() {
		return this.month;
	}

	/**
	* Getter for count
	* @return count
	*/
	public int getCount() {
		return this.count;
	}

	/**
	* increments count by one
	*/
	public void increment() {
		this.count++;
	}

	/**
	* Setter for Month
	* @param month to set
	*/
	public void setMonth(String month) {
		this.month = month;
	}
}