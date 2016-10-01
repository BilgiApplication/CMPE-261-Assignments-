
/**
 * @author veyisegemenerden
 *
 */
abstract class  Products  {
private int id;
private double price;
private String name;


public Products(String name,int id , double price ){
	super();
	this.name=name;
	this.id=id;
	this.price=price;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


	public String toString(){
		return  "Product's name  is : "+getName()+"\n Product's ID is : "+"****"+getId()+"****"+"\n Product's price is : " +getPrice()+"$" ; 
	}
}
