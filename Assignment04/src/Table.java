import java.util.Random;

/**
 * @author veyisegemenerden
 *
 */
class Table {
	// I do not need to change variable or show in this class.Therefore, I do
	// not use getter setter method. I can access variable with construct.
	private double[][] array;
	

	// My construct has two parameter
	public Table(int row, int col) {
		array = new double[row][col];
		random();
	}

	// This method initializes random double variable in row and columns
	public void random() {
		Random randomizer = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = randomizer.nextDouble() * 1000000;
			}
		}
	}

	// I used the insertion sort because it is faster than other sorting method
	// in short range
	public void sortAverageIncreasing() {
		int j;
		double[] temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && calculateAverage(array[j]) > calculateAverage(temp)) {
				array[j + 1] = array[j];
				array[j] = temp;
				j--;
			}
		}
	}

	/**
	 * 
	 */
	public void sortAverageDecreasing() {
		int j;
		double[] temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && calculateAverage(array[j]) < calculateAverage(temp)) {
				array[j + 1] = array[j];
				array[j + 1] = temp;
				j--;
			}

		}
	}

	// This method calculates every single row average.
	public double calculateAverage(double[] array) {
		double average = 0.0;
		for (int i = 0; i < array.length; i++) {
			average = average + array[i];
		}
		return average / array.length;
	}

	// I used toString method because, if I use printf method i take printf
	// id.Therefore, I used "String.format".
	public String toString() {
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result = result + "{";
			for (int j = 0; j < array[i].length - 1; j++) {
				result = result + String.format("%.2f", array[i][j]) + " ";
			}
			result = result + String.format("%.2f", array[i][array[i].length - 1]) + "} Average = "
					+ String.format("%.2f", calculateAverage(array[i])) + "\n";

		}
		return result;
	}
}