package inheritance;
import java.util.ArrayList;
import java.util.List;
public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;
    private List<Review> reviews;

    public Restaurant(String name, int priceCategory){
        this.name= name;
        this.stars = 0 ;
        this.priceCategory = this.priceCategory;
        this.reviews = new ArrayList<>();
    }
    public void addReview (Review review){
        if (!reviews.contains(review)){
            reviews.add(review);
            recalculateStars();
        }

    }
    private void recalculateStars(){
        int totalStars= 0 ;
        for (Review review: reviews){
            totalStars += review.getStars();
        }
        stars = totalStars/ reviews.size();
    }

    @Override
    public String toString() {
        return  String.format("Restaurant: %s | Stars: %d | Price: %s",
                name, stars, "$".repeat(priceCategory));

    }
}
