package inheritance;

public class Testing {
    public static void main(String[] args) {
        testRestaurant();
        testShop();
        testTheater();
        testReview();
    }

    public static void testRestaurant() {
        Restaurant restaurant = new Restaurant("Delicious Eats", 4, 2);
        Review review1 = new Review("Great food!", "John", 5, restaurant);
        Review review2 = new Review("Good atmosphere, but pricey", "Jane", 3, restaurant);

        restaurant.addReview(review1);
        restaurant.addReview(review2);

        restaurant.updateStars();

        System.out.println("Restaurant Details:\n" + restaurant);
    }

    public static void testShop() {
        Shop shop = new Shop("Cool Gadgets", "Gadget store with a variety of items", 2);
        Review review1 = new Review("Awesome selection!", "Alex", 4, shop);

        shop.addReview(review1);

        System.out.println("Shop Details:\n" + shop);
    }

    public static void testTheater() {
        Theater theater = new Theater("Cineplex");
        theater.addMovie("Avengers: Endgame");
        theater.addMovie("The Lion King");

        Review review1 = new Review("Great movie experience!", "Sam", 4, theater, "Avengers: Endgame");

        theater.addReview(review1);

        System.out.println("Theater Details:\n" + theater);
    }

    public static void testReview() {
        Restaurant restaurant = new Restaurant("Fancy Dining", 5, 3);
        Review review1 = new Review("Excellent service and food!", "Mike", 5, restaurant);

        Theater theater = new Theater("Movie Nights");
        theater.addMovie("Star Wars: A New Hope");
        Review review2 = new Review("Enjoyed the movie", "Lisa", 4, theater, "Star Wars: A New Hope");

        System.out.println("Reviews:\n" + review1 + "\n" + review2);
    }
}
