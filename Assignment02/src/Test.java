
//this program v1.0
//I made a lot of code repetition , it should be smarter way.
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here is part of A seats
		// this is my object
		
		Seat A = new Seat(10, 5);
		
		// print method
		System.out.println("A " + " Count of Sold :" + A.getsoldCount() + "ticket price is :"
				+ A.getpriceTicket());
		// income of a part
		Seat.partFind(A.getsoldCount(), A.getpriceTicket());
		// here is part of B seats
		// this is my object
		Seat B = new Seat(10, 1);
		
		// print method
		System.out.println("B " + " Partinda Bu kadar koltuk satildi:" + B.getsoldCount() + "ticket price is :"
				+ B.getpriceTicket());
		// income of b part
		Seat.partFind(B.getsoldCount(), B.getpriceTicket());

		// here is part of C seats
		
		// this is my object
		Seat C = new Seat(10, 1);
		
		// print method
		System.out.println("C " + " Partinda Bu kadar koltuk satildi:" + C.getsoldCount() + "ticket price is :"
				+ C.getpriceTicket());
		
		// income of c part
		Seat.partFind(C.getsoldCount(), C.getpriceTicket());

		System.out.println(Seat.totalSales(Seat.liste));

	}

}
