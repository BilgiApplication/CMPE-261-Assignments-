

import java.util.Scanner;


/**
 * @author veyisegemenerden
 *
 */
public class Method {
/**
 * variables
 */
	Person[] list = new Person[10];
	Scanner scr = new Scanner(System.in);
	private int Count;

	public void addPerson(Person a) {

		list[Count] = a;
		Count++;

	}

	/**
	 * @param who  if list of element equals to index  swaping  list's index.
	 */
	public void removePerson(String who) {
		
		for (int i = 0; i < Count; i++) {
			if (list[i].getName().equals(who)){
				list[i] = list[i + 1];
				Count--;
				break;
			}if(list[i]==list[Count-1]){
				System.out.println("We could not remove "+who+" because "+who+" is not in the book" );
			}
			
		}
	}
	
/**
 * 
 * @param a Method visits all index while index of name equals parameter a
 */
	public void searchPerson(String a) {
		for (int i = 0; i < Count; i++) {
			if (list[i].getName().equals(a)) {
			
				System.out.println(a + " is in the address book");
				break;
			} if(list[i]==list[Count-1]){
				System.out.println(a + " is not found");

			}
			
		}

	}
	

	/**
	 * This method takes someone's name and it searchs in list if it could find name , you can change name of index.
	 * @param oldName
	 * @param newName
	 */
	public void ModifyName(String oldName, String newName) {
		for (int i = 0; i < Count; i++) {
			if (list[i].getName().equals(oldName)) {
				list[i].setName(newName);
			}else{
				System.out.println("We could not remove "+oldName+" because"+oldName+" is not in the book" );
			}
		}

	}
/**
 * This method takes someone's address and it searchs in list if it could find address , you can change address of index.
 * @param oldAddress
 * @param newAddress
 */
	
	public void ModifyAddress(String oldAddress, String newAddress) {
		for (int i = 0; i < Count; i++) {
			if (list[i].getAddress().equals(oldAddress)) {
				list[i].setAddress(newAddress);
			}else{
				System.out.println("We could not remove "+oldAddress+" because"+oldAddress+" is not in the book" );
			}
		}

	}
/**
 * print method for array
 */
	public void print() {
		for (int i = 0; i < Count; i++) {
			System.out.println(list[i]);
		}
	}
}
