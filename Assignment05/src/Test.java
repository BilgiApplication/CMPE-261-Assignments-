import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author veyisegemenerden
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);

			/*
			 * Variables
			 * 
			 */
			int want = 0;

			// Products
			int id = 0;
			int price = 0;
			String name;

			// Automobiles,ElectronicAppliances and Furniture
			String color = null;

			// ElectronicAppliances
			double watt = 0;
			// Automobiles
			double speed;
			// Furniture
			int part;
			// CompactDisks
			double size;
			double capasity;

			Methods m = new Methods();

			System.out.println("WELCOME TO ASSET");

			/**
			 * do-while condition
			 */

			do {

				System.out.println(" ");
				System.out.println("1:Add\n2:Delete\n3:Modify\n4:Search\n5:Show\n6:Quit");
				System.out.println("Choose a number for your request");
				want = scan.nextInt();
              
				if (want == 1) {
					System.out.println("\n1 Electronic Appliances\n2 Automobiles\n3 Furniture\n4 CompactDisks");
					int cases = scan.nextInt();
					// This if helps me for avoiding to unnessesery number.
					if (cases != 0 && cases < 5) {
					
					System.out.println("Please, write NAME of PRODUCT");
					name = scan.next().trim().toUpperCase();
					
					System.out.println("Please, write ID of PRODUCT");
					id = scan.nextInt();
					
					System.out.println("Please, write PRICE of PRODUCT");
					price = scan.nextInt();

					//I used switch-case because i have four conditions and  i should choose one .

					switch (cases) {
					case 1:
						System.out.println("You are progressing about Electronic Appliances! ");
						System.out.println();

						System.out.println("Please, write WATT of Electronic Appliances");
						watt = scan.nextDouble();
						System.out.println("Please, write COLOR of Electronic Appliances");
						color = scan.next().trim().toUpperCase();
                           
						ElectronicAppliances a = new ElectronicAppliances(name, id, price, watt, color);
                      //i use try-catch because products.length equals null when program started because i did not add veriable.
						
						try {
							//this if looks array is empty or not.
							if (m.products.length != 0) {

								int l = 0;
								//this while loop looks  given id is exist.
								while (l <= m.products.length) {
									//here if id is exist in array adding to stop.
									if (m.products[l].getId() == id) {
										System.out.println("This id is exist.Please change ID.");
										break;
									}

									l++;

								}
                                    //here if id is not exist in array product will add.  
								if (m.products[l].getId() != id) {
									m.addProduct(a);

									System.out.println("Add is succesfull");
									break;
								}
							}
							// I escape first null situation  and i add product
						} catch (NullPointerException t) {
                                
							m.addProduct(a);
						}
						break;

					//SAME CASE 1
					case 2:
						System.out.println("You are progressing about AUTOMOB�LES! ");
						System.out.println();

						System.out.println("Please, write SPEED of AUTOMOB�LE");
						speed = scan.nextDouble();
						System.out.println("Please, write COLOR of AUTOMOB�LE");
						color = scan.next().trim().toUpperCase();

						Automobiles b = new Automobiles(name, id, price, color, speed);

						try {
							if (m.products.length != 0) {
								int l = 0;
								while (l <= m.products.length) {
									if (m.products[l].getId() == id) {
										System.out.println("This id is exist.Please change ID.");
										break;
									}

									l++;

								}

								if (m.products[l].getId() != id) {
									m.addProduct(b);

									System.out.println("Add is succesfull");
									break;
								}
							}
						} catch (NullPointerException t) {
							m.addProduct(b);

						}
						break;

						//SAME CASE 1
					case 3:
						
						System.out.println("You are progressing about FURNITURE! ");
						System.out.println();

						System.out.println("Please, write PART of FURNITURE");
						part = scan.nextInt();
						System.out.println("Please, write COLOR of FURNITURE");
						color = scan.next().trim().toUpperCase();

						Furniture c = new Furniture(name, id, price, color, part);

						try {
							if (m.products.length != 0) {

								int l = 0;
								while (l <= m.products.length) {
									if (m.products[l].getId() == id) {
										System.out.println("This id is exist.Please change ID.");
										break;
									}

									l++;

								}

								if (m.products[l].getId() != id) {
									m.addProduct(c);

									System.out.println("Add is succesfull");
									break;
								}
							}
						} catch (NullPointerException t) {
							m.addProduct(c);
						}

						break;

						//SAME CASE 1
					case 4:
						System.out.println("You are progressing about COMPACT DISKS! ");
						System.out.println();
						System.out.println("Please, write SIZE of COMPACT DISKT");
						size = scan.nextDouble();
						System.out.println("Please, write CAPASITY COMPACT DISK");
						capasity = scan.nextDouble();

						CompactDisks d = new CompactDisks(name, id, price, size, capasity);
						try {
							if (m.products.length != 0) {

								int l = 0;
								while (l <= m.products.length) {
									if (m.products[l].getId() == id) {
										System.out.println("This id is exist.Please change ID.");
										break;
									}

									l++;

								}

								if (m.products[l].getId() != id) {
									m.addProduct(d);

									System.out.println("Add is succesfull!");
									break;
								}
							}
						} catch (NullPointerException t) {
							m.addProduct(d);
						}

						break;

					}} else {
						// if user choose different number except 1-4 numbers
						System.out.println("WRONG!!! Choosing!\nPlease choose 1-4 numbers");

					}

				} else if (want == 2) {
					m.print();
					System.out.println("Please, write ID of the PRODUCT");
					int idP = scan.nextInt();
					m.deleteProduct(idP);
				} else if (want == 3) {
					System.out.println("NAME,ID or PRICE? Which information do you want to modify?");
					String input = scan.next().toUpperCase();
					System.out.println(input);
					if (input.equals("NAME")) {
						System.out.println("write old NAME of the PERSON");
						String oldName = scan.next().trim().toUpperCase();
						System.out.println("Write new NAME of the PERSON");
						String newName = scan.next().trim().toUpperCase();
						m.modifyName(oldName, newName);
					
					} else if (input.equals("ID")) {

						System.out.println("write old ID of the PRODUCT");
						int oldId = scan.nextInt();
						System.out.println("Write new ID of the PRODUCT");
						int newId = scan.nextInt();
					
							m.modifyId(oldId, newId);
					
					}if (input.equals("PRICE")) {
						System.out.println("Write old PRICE of the PRODUCT");
						int oldPrice = scan.nextInt();
						System.out.println("Write new PRICE of the PRODCUT");
						int newPrice = scan.nextInt();
						m.modifyPrice(oldPrice, newPrice);
					
				}} else if (want == 4) {
					System.out.println("Please, write the ID of the PRODUCT for searching");
					id = scan.nextInt();
					if (m.searchProduct(id)) {
						System.out.println(id + " is found in your PRODUCTS");

					} else {
						System.out.println(id + " is not found in PRODUCTS");
					}

				} else if (want == 5) {
					m.print();
				}
			} while (want != 6);

		} catch (InputMismatchException errors) {
			System.out.println("Please write carefully. Process is over and run again!");
		}

	}
}
