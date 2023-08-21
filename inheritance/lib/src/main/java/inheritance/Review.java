package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars ;
    private Restaurant restaurant;

    public  Review(String body, String author, int stars, Restaurant restaurant ){
        this.body =body;
        this.author = author;
        if (stars >= 0 && stars<= 5){
            this.stars= stars;
        } else {
           throw new IllegalArgumentException("stars rating must be between 0 and 5 ");
        }
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }
    public int getStars(){
        return stars;
    }

    @Override
    public String toString() {
        return String.format("Review by %s | Stars: %d\n%s", author, stars, body);
    }
}
