//William Jagroop
/*This class is used to create a hash table labed as HashMovie in order to allow it to be used in StorageInventory.java*/
import java.util.Hashtable;
public class MovieTable {
	int MovieList = 0;
	Hashtable hashMovie = new Hashtable();
	public void increase(Movie f){
		hashMovie.put(MovieList++,f);
	}
}