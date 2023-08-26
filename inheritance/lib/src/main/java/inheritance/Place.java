package inheritance;

import java.util.ArrayList;
import java.util.List;

class Place {
    protected String name;
    protected List<Review> reviews;

    public Place(String name) {
        this.name = name;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public String getName() {
        return name;
    }
}

