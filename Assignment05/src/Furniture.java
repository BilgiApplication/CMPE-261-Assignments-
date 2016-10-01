
/**
 * @author veyisegemenerden
 *
 */
public class Furniture extends Products {
private String colors;
private int part;

public Furniture(String name ,int id,double price ,String colors, int part ){
	super(name,id,price);
	this.colors=colors;
	this.part=part;
	
}

public String getColors() {
	return colors;
}

public void setColor(String colors) {
	this.colors = colors;
}

public int getPart() {
	return part;
}

public void setPart(int part) {
	this.part = part;
}

public String toString(){
	return super.toString()+ " \nFurniture's color is : "+getColors()+" \nFurniture's part is : "+ getPart(); 
}

}
