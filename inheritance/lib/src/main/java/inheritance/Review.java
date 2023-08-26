package inheritance;

class Review {
    private String body;
    private String author;
    private int stars;
    private Place place;
    private String movie;

    public Review(String body, String author, int stars, Place place) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.place = place;
    }

    public Review(String body, String author, int stars, Theater theater, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.place = theater;
        this.movie = movie;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        String reviewInfo = String.format("Author: %s\nStars: %d\n%s", author, stars, body);
        if (place != null) {
            reviewInfo += "\nPlace: " + place.getName();
            if (place instanceof Theater && movie != null) {
                reviewInfo += "\nMovie: " + movie;
            }
        }
        return reviewInfo;
    }
}
