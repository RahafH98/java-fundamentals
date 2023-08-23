package inheritance;

import java.util.ArrayList;
import java.util.List;

class Shop {
    private String name;
    private String description;
    private int dollarSigns;
    private List<Review> reviews;

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Shop: %s\nDescription: %s\nDollar Signs: %d", name, description, dollarSigns);
    }


}
