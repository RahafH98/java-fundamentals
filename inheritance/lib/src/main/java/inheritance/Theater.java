package inheritance;

import java.util.ArrayList;
import java.util.List;

class Theater {
    private String name;
    private List<String> movies;
    private List<Review> reviews;

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Theater: %s\nMovies: %s", name, movies.toString());
    }


}
