
package inheritance ;

import java.util.ArrayList;
import java.util.List;

class Restaurant extends Place {
    private int stars;
    private int priceCategory;

    public Restaurant(String name, int stars, int priceCategory) {
        super(name);
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public void updateStars() {
        int totalStars = reviews.stream().mapToInt(review -> review.getStars()).sum();
        stars = totalStars / reviews.size();
    }
}
