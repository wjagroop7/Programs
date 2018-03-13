import java.util.Hashtable;
import java.util.Random;

public class Movie {
	String movie;
	float rating;
	
	String getMovie(){
		return movie;
	}
	float getRating(){
		return rating;
	}
	void setRating(String rat){
		rating = Float.parseFloat(rat);
	}
	void setMovie(String mov){
		movie = mov;
	}
	

}
