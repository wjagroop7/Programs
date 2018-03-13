//William Jagroop
import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class RottenMain {
	public static void main(String[] args) {
		StorageInventory readFile = new StorageInventory();
		int input=0;
		System.out.println("1)See List      "+ "2)Delete Movie      "+ "3)Add Movie     "+ "4) Terminates Project");
		while(input!=4 && input!=-1){
			Scanner through= new Scanner(System.in);
			input=through.nextInt();
			switch(input)	//this is for the diffrent options being completed in cases
		      {
		         case 1 :
		        	 readFile.print();
		        	 break;
		         case 2 :
		        	 readFile.deletion();
		        	 break;
		         case 3 :
		     		 readFile.addition();
		        	 break;
		         case 4:
		        	 System.out.println("Disable Run.");
		        	 break; 
		      }
		}
	}

}
