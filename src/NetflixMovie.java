
public class NetflixMovie {
public static void main(String[] args) {
	Movie avengers = new Movie("ThanosSnap",9);
	Movie badsequel = new Movie("RandomStarWars", 4);
	Movie pixarmovie = new Movie("Wall-E",10);
	Movie disneyremake = new Movie("Aladdin", 6);
	Movie randomgoodmovie = new Movie("Idk,the movie",8);
//	System.out.println(avengers.getTicketPrice());
	NetflixQueue Que = new NetflixQueue();
	Que.addMovie(avengers);
	Que.addMovie(randomgoodmovie);
	Que.addMovie(pixarmovie);
	Que.addMovie(disneyremake);
	Que.addMovie(badsequel);
	//System.out.println(Que);
System.out.println(Que.getMovies());
	for (int i = 0; i < 5; i++) {
		System.out.println(Que.getMovie(i));
	}
	System.out.println("The best movie is " + Que.getBestMovie());
	System.out.println("The second best movie is" + Que.getSecondBestMovie());
}
}
