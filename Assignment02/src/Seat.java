
public class Seat {
	// Access has been disabled for my variables from other class.
	private int soldCount;

	private double priceTicket;

	private static double a;

	private static int Count;

	static double[] liste = new double[3];

	// Here is my construct.It takes two variables.Serie of variable is
	// important if you don't write regular , you will take error.
	public Seat(int soldCount, double priceTicket) {
		this.soldCount = soldCount;
		this.priceTicket = priceTicket;
	}

	// My variable is disabled from out class. This method helps me to change
	// value.
	public void setsoldCount(int seatCount) {
		this.soldCount = seatCount;

	}

	// My variable is disabled from out class. This method helps me to change
	// value.
	public void setpriceTicket(double soldTicket) {
		this.priceTicket = soldTicket;
	}

	// My variable is private. Therefore, I use this method for access my
	// variable.
	public int getsoldCount() {
		return soldCount;
	}

	// My variable is private. Therefore, I use this method for access my
	// variable.
	public double getpriceTicket() {
		return priceTicket;
	}

	// this method finds part sale of seats.
	public static void partFind(int d, double b) {
		a = d * b;
		Seat.addToList(a);
	}

	// I added part sale of seats to list for holding
	public static void addToList(double added) {

		liste[Count] = added;
		Count++;

	}

	// I use my created array and I sum of the each element
	public static double totalSales(double[] i) {
		double sonuc = i[0] + i[1] + i[2];
		return sonuc;

	}

}
