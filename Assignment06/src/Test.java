import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * This Assignment is about txt file process.
 */
/**
 * @author veyisegemenerden
 *
 */
public class Test {
	int count = 0;

	// I used arraylist for holding my information .
	ArrayList Information=new ArrayList();
	
	public ArrayList readFile(String x){
		try {
			Scanner oku=new Scanner(new FileInputStream(x));

			// this while if text has a line adding  to arraylist. 
			while (oku.hasNextLine()) {
				// Here divides two parts
				Information.add(oku.nextLine());
				
            	   
               }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Information;
	}
	

	public void writeFile(String x) {
		try {
         
			Scanner oku = new Scanner(new FileInputStream(x));

			// This code reads from "txt"
            PrintWriter p=new PrintWriter(new FileOutputStream("Output.txt",false));
			while (oku.hasNextLine()) {
				// Here divides two parts
				String[] Lists = oku.nextLine().split(" ");
                 
				//This for looks letter if it finds something. it changes words with informations. 
				for(int i =0; i< Lists.length; i++){
            	   if(Lists[i].equals("<<N>>,")){
            		   Lists[i]=(String) Information.get(0);
            	   }

                    if(Lists[i].equals("<<A>>")){
                    	Lists[i]=(String)Information.get(1);
                    }
                    
                    if(Lists[i].equals("<<G>>,")){
                    	Lists[i]=(String)Information.get(2);
                    }   
            	   
               }
                 // Here to write letter to txt
                 for(int i=0; i<Lists.length; i++){
                	 p.print(Lists[i]+" ");
                 }

				p.print("\n");

				
			}
			p.close();
		} catch (IOException iox) {
		
			System.out.println("list.txt" + " is unreadable.");

		

		}
		
	}
	

	public static void main(String[] args) {
		Test t1=new Test();
		t1.readFile("Information.txt");
		t1.writeFile("Letter.txt");
       
	}
}
