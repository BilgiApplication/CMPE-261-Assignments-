
/**
 * @author veyisegemenerden
 *
 */
public class Person {
/**
 * variables
 */
	private String name;
	private String address;

	public Person() {
	}
   /**
    * contractor 
    * @param name
    * @param address
    */
	public Person(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
/**
 * to String method
 */
	public String toString() {

		return "person name : " + name + " person address :" + address;
	}

}
