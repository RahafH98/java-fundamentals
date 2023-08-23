package inheritance;
import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;
    private List<Review> reviews;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
        updateStars();
    }

    private void updateStars() {
        int totalStars = reviews.stream().mapToInt(review -> review.getStars()).sum();
        stars = totalStars / reviews.size();
    }

    public String getName() {
        return name;
    }

}
