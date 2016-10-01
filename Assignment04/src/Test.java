		/* This assignment works  taking variable from terminal.
		 *  Therefore, firstly you should find "scr" file of Assignment04.
		 *  Then you should write javac *java or javac Test.java and javac Table.java.(This code compailes your source codes.)
		 *  Finally, you should write java Test "countOfColumn" "countOfRow" "orderOfSorting" exp: java Test "3" "2" "i"
		 */
/**
 * @author veyisegemenerden
 *
 */
class Test {
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// I can take variable from user with Integer.valueOf() in this code
		Table matrix = new Table(Integer.valueOf(args[0]), Integer.valueOf(args[1]));

		System.out.println("You created random table.");
		System.out.println(matrix + "\n");

		// If user writes "i" my program sorts averages to increasing
		if (args[2].equals("i")) {
			matrix.sortAverageIncreasing();

			// If user writes "d" my program sorts averages to decreasing
		} else if (args[2].equals("d")) { // decreasing sort
			matrix.sortAverageDecreasing();

			// I inhibited other words and numbers
		} else {
			System.out.println("Invalid input");
		}

		// Table's toString method formats the string.

		System.out.println("Your table is after sorting");
		System.out.println(matrix);
		
	}
}