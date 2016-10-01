
/**
 * @author veyisegemenerden
 *
 */
public class ElectronicAppliances extends Products  {
private double watt;
private String color;

public ElectronicAppliances(String Name,int id,double price ,double watt,String color){
	super(Name,id,price);
	this.color=color;
	this.watt=watt;
	
}

public double getWatt() {
	return watt;
}

public void setWatt(double watt) {
	this.watt = watt;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String toString(){
	return   super.toString()+" \nElectronic Appliances' color is : "+getColor()+" \nElectronic Appliances' watt is : "+ getWatt()+"W";
}


}
