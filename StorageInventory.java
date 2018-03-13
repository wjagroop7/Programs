//William Jagroop
import javax.swing.JOptionPane;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StorageInventory {
	Scanner infor=null;
	Scanner read= new Scanner(System.in);
	Movie MI;
	MovieTable hashM=new MovieTable();
	
	StorageInventory(){
		try{
			File inputFile = new File("rottenTomatoes.txt");//input textfile
			infor = new Scanner(inputFile);	//reads through file
			infor.useDelimiter(",|\n");
      		 while(infor.hasNext()){
      			 MI =new Movie();
      			 String info=infor.next();
      			 hashM.increase(MI);
      			  MI.setMovie(info);
      			 MI.setRating(info=infor.next());
      			 
      		 }
		}
		catch(FileNotFoundException e){	//Incase no file was found
			System.out.println("File not found");
      		 e.printStackTrace();
		}
	}
	
	public void print(){	//prints the list 
		
			Enumeration Movieb=hashM.hashMovie.keys();
			int start;
	 		while(Movieb.hasMoreElements()) {
	 			start =(int) Movieb.nextElement();
	 			Movie init=(Movie) hashM.hashMovie.get(start);
	 			System.out.println("Movie: "+init.getMovie()+", Rating: "+init.getRating());
	 		}

	}
	public void updated(){	//updates the new movie
		try {
			int start;
 			PrintWriter out = new PrintWriter("rottenTomatoes.txt");
 			
 			Enumeration Movieb=hashM.hashMovie.keys();
 	 		while(Movieb.hasMoreElements()) {
 	 			start =(int) Movieb.nextElement();
 	 			Movie init=(Movie) hashM.hashMovie.get(start);
 	 			out.println(init.getMovie()+","+init.getRating());
 	 		}out.close();
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		}
	}
	public void addition(){
		System.out.print("New Movie: ");
		String info=read.next();
		MI =new Movie();
		MI.setMovie(info);
		System.out.print("New Rating: ");
		MI.setRating(info=read.next());
		hashM.increase(MI);
		updated();
		
	}
	
	public void deletion(){	//deletes the entire movie
		System.out.print("Which Movie do you want to delete?");
		String data=read.next();
		int start;
		Enumeration Movieb=hashM.hashMovie.keys();
		System.out.print(data + " has been deleted.");
 		while(Movieb.hasMoreElements()) {
 			start =(int) Movieb.nextElement();
 			Movie product=(Movie) hashM.hashMovie.get(start);
 			if(product.getMovie().equals(data)){
 				hashM.hashMovie.remove(start);
 			}
 		}
	}
}