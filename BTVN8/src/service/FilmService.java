package service;

import model.Film;
import model.Movie;
import model.Serial;

import java.util.ArrayList;

public class FilmService {
    public ArrayList<Movie> movies;
    public ArrayList<Serial> serials;

    public FilmService() {
        init();
    }

    public void init() {
        movies = new ArrayList<>();
        movies.add( new Movie("1", "End Game", "fiction", "Cameron", "20/12/2202", 20));
        movies.add( new Movie("2", "Avatar", "fiction", "ddsa", "20/12/2202", 20));
        movies.add( new Movie("3", "Doctor Strange", "fiction", "sdf", "20/12/2202", 20));
        movies.add( new Movie("4", "Venom", "fiction", "see", "20/12/2202", 20));

        serials = new ArrayList<>();

        serials.add( new Serial("5", "Breaking bad", "criminal", "33", "20/12/2202", 20, 102));
        serials.add( new Serial("6", "Prison Break", "criminal", "33", "20/12/2202", 20, 102));
        serials.add( new Serial("7", "House of Card", "criminal", "33", "20/12/2202", 20, 102));
    }

    public ArrayList<Film> getFilms() {
        ArrayList<Film> films = new ArrayList<Film>();

        films.addAll(movies);
        films.addAll(serials);
        return films;
    }

    public ArrayList<Film> searchByName(String search) {
        var result = new ArrayList<Film>();

        for (Film film: this.getFilms()
             ) {
            if (film.filterByName(search)) {
                result.add(film);
            }

        }


        return result;
    }

    public void prints(ArrayList<Film> films) {
        if (films.isEmpty()) {
            System.out.println("No films");
        }
        for (Film film: films
        ) {
            System.out.println(film);

        }
    }

}
