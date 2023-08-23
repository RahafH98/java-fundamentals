package inheritance;

public class Testing {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Fancy Eats", 4, 3);
        Review restaurantReview = new Review("Delicious food!", "Customer1", 5, restaurant);
        restaurant.addReview(restaurantReview);
        System.out.println(restaurant.toString());


        Shop shop = new Shop("Cool Shop", "A place to shop", 3);
        Review shopReview = new Review("Great products!", "Customer2", 4, shop);
        shop.addReview(shopReview);
        System.out.println(shop.toString());


        Theater theater = new Theater("Movie Palace");
        theater.addMovie("Movie1");
        theater.addMovie("Movie2");
        Review theaterReview = new Review("Awesome experience!", "Moviegoer1", 5, theater, "Movie1");
        theater.addReview(theaterReview);
        System.out.println(theater.toString());
    }
}
