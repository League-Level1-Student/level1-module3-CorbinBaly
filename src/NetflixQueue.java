/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */



import java.util.ArrayList;
import java.util.Collections;

public class NetflixQueue {
	Movie avengers = new Movie("ThanosSnap",9);
	Movie badsequel = new Movie("RandomStarWars", 4);
	Movie pixarmovie = new Movie("Wall-E",10);
	Movie disneyremake = new Movie("Aladdin", 6);
	Movie randomgoodmovie = new Movie("Idk,the movie",8);
	ArrayList<Movie> movies = new ArrayList<Movie>();
	public Movie getAvengers() {
		return avengers;
	}
	public void setAvengers(Movie avengers) {
		this.avengers = avengers;
	}
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		
		}
	}

}
