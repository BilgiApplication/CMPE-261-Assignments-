
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author veyisegemenerden
 *
 */
public class Test {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int what = 0;
		String input;
		String name = null;
		String address = null;
		String k = "Do you want to";
		String t = "Please, write the person's name";
		String c = "Please, write the person's address";

		Method mh = new Method();
		
		/**
		 * try -catch
		 */
		try {
			/**
			 * do-while loop
			 */
			do {
				System.out.println();
				System.out.println("Please,choose your process number");
				System.out.println();
				System.out.println("1:" + k + " add someone?\n2:" + k + " delete someone?\n3:" + k
						+ " modify someone?\n4:" + k + " search someone?\n5:" + k + " quit?");

				what = scan.nextInt();

				if (what == 1) {
					System.out.println(t);
					name = scan.next();
					System.out.println(c);
					address = scan.next();

					Person i = new Person(name, address);
					mh.addPerson(i);

				} else if (what == 2) {
					mh.print();
					System.out.println(t);
					String who = scan.next();
					mh.removePerson(who);
				} else if (what == 3) {
					System.out.println("Which information do you want to modify? name or address");
					input = scan.next().toLowerCase();
					if (input.equals("name")) {
						System.out.println(t);
						String oldName = scan.next();
						System.out.println("Write new name of the person");
						String newName = scan.next();
						mh.ModifyName(oldName, newName);
					} else if (input.equals("address")) {
						System.out.println(c);
						String oldAddress = scan.next();
						System.out.println("Write new address of the person");
						String newAddress = scan.next();
						mh.ModifyAddress(oldAddress, newAddress);
					} else {
						System.out.println();
					}
				} else if (what == 4) {
					System.out.println(t + " for searching");
					name = scan.next();
					mh.searchPerson(name);

				}
			} while (what != 5);

			mh.print();
		} catch (InputMismatchException hata1) {
			System.out.println("Please write carefully. Process is over and run again!");
		}
	}

}