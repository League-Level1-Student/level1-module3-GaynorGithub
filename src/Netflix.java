
public class Netflix {

	public static void main(String[] args) {
		Movie shark = new Movie("Sharknado 17", 5);
		Movie bark = new Movie("Marley and I", 4);
		Movie dark = new Movie("Twilight: Return of the Sith", 2);
		Movie mark = new Movie("Hit or Miss", 1);
		Movie park = new Movie("The Fast and Really Angry", 3);

		System.out.println("What is the price of: Twilight: Return of the Sith?");
		System.out.println(dark.getTicketPrice());

		NetflixQueue q = new NetflixQueue();

		q.addMovie(shark);
		q.addMovie(bark);
		q.addMovie(dark);
		q.addMovie(mark);
		q.addMovie(park);

		q.sortMoviesByRating();

		System.out.println("");

		q.printMovies();

		System.out.println("");

		System.out.println("The best movie is: " + q.getBestMovie());
		System.out.println("The second best movie is: " + q.getMovie(1));

	}
}
