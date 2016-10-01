
/**
 * @author veyisegemenerden
 *
 */
public class Automobiles extends Products {
private String color;
private double speed;

public Automobiles(String name ,int id,double price ,String color,double speed){
	super(name,id,price);
	this.color=color;
	this.speed=speed;
	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public String toString(){
	return super.toString()+" \nCar's color is : "+getColor()+ " \nCar's speed is : "+ getSpeed();
}

}
