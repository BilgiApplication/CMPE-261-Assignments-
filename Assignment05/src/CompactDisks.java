
/**
 * @author veyisegemenerden
 *
 */
public class CompactDisks extends Products {
private double size;
private double  capasity;

public CompactDisks(String name ,int id,double price ,double size,double capasity){
	super(name,id,price);
	this.size=size;
	this.capasity=capasity;
	
}

public double getCapasity() {
	return capasity;
}

public void setCapasity(double capasity) {
	this.capasity = capasity;
}

public double getSize() {
	return size;
}

public void setSize(double size) {
	this.size = size;
}

public String toString(){
	return super.toString()+" \nCompact Disks's size is : "+getSize()+ " \nCompact Disks's capasity is : "+getCapasity()  ;
	
}
}
