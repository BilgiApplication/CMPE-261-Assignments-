import java.util.Scanner;

/**
 * @author veyisegemenerden
 *
 */
public class Methods {
	Products[] products = new Products[100];
	Scanner scr = new Scanner(System.in);

	/**
	 * 
	 * Count is a integer variable
	 */
	private int Count;

	/**
	 * insert new Product to Products Array
	 * 
	 * @param a
	 *            parameter of the addProduct method
	 */
	public void addProduct(Products a) {

		products[Count] = a;
		Count++;

	}

	/**
	 * delete person in address book
	 * 
	 * @param input
	 *            parameter of the delete method
	 */
	public void deleteProduct(int id) {
		for (int i = 0; i < Count; i++) {
			if (products[i].getId() == (id)) {
				products[i] = products[i + 1];
				
				System.out.println(products[i].getName()+ " is removed");
				products[i]=null;
				i=0;
				break;

			}
			if (products[i] == products[Count - 1]) {
				System.out.println("products  not found");
			}

		}

	}

	/**
	 * search Product in Product Array
	 * 
	 * @param id
	 *            parameter of the searchProduct method
	 * @return true or false
	 */
	public boolean searchProduct(int id) {
		for (int i = 0; i < Count; i++) {
			if (products[i].getId() == (id)) {
				return true;

			}
		}
		return false;

	}

	/**
	 * modify name in Products Array
	 * @param oldName
	 *  			parameter of the modifyName method
	 * @param newName
	 * 				parameter of the modifyName method
	 */
	
	public void modifyName(String oldName, String newName) {
		for (int i = 0; i < Count; i++) {
			if (products[i].getName() == (oldName)) {
				for (int j = 0; j < Count; j++) {
					if (products[j].getName() == newName) {
						System.out.println("This ID is exist.");
						break;

					}

					if (products[j].getName() != newName) {

						products[i].setName(newName);
						System.out.println("Successfully Modify ID");
                        break;
					}

				}
			}
		}
	}

	/**
	 * @param oldPrice
	 * @param newPrice
	 */
	public void modifyPrice(int oldPrice, int newPrice) {
		for (int i = 0; i < Count; i++) {
			if (products[i].getPrice() == (oldPrice)) {
				for (int j = 0; j < Count; j++) {
					if (products[j].getPrice() == newPrice) {
						System.out.println("This ID is exist.");
						break;

					}

					if (products[j].getPrice() != newPrice) {

						products[i].setPrice(newPrice);
						System.out.println("Successfully Modify ID");
                        break;
					}

				}
			}
		}
	}

	/**
	 * modify ID in Products Array
	 * 
	 * @param oldid
	 *            parameter of the modifyIds method
	 * @param newid
	 *            parameter of the modifyIds method
	 */
	public void modifyId(int oldid, int newid) {
		for (int i = 0; i < Count; i++) {
			if (products[i].getId() == (oldid)) {
				for (int j = 0; j < Count; j++) {
					if (products[j].getId() == newid) {
						System.out.println("This ID is exist.");
						break;

					}

					if (products[j].getId() != newid) {

						products[i].setId(newid);
						System.out.println("Successfully Modify ID");
                        break;
					}

				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < Count; i++) {
			System.out.println(products[i]);
			System.out.println("\n");

		}
	}
}
