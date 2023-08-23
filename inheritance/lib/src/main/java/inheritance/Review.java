package inheritance;

class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movie;

    public Review(String body, String author, int stars, Restaurant restaurant) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.restaurant = restaurant;
    }

    public Review(String body, String author, int stars, Shop shop) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.shop = shop;
    }

    public Review(String body, String author, int stars, Theater theater, String movie) {
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.theater = theater;
        this.movie = movie;
    }

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }

    public String toString() {
        String reviewInfo = String.format("Author: %s\nStars: %d\n%s", author, stars, body);
        if (restaurant != null) {
            return reviewInfo + "\nRestaurant: " + restaurant.getName();
        } else if (shop != null) {
            return reviewInfo + "\nShop: " + shop.getName();
        } else if (theater != null) {
            return reviewInfo + "\nTheater: " + theater.getName() + "\nMovie: " + movie;
        }
        return reviewInfo;
    }
}

