package inheritance;

public class Main {
    public static void main(String[] args){
        //to create a new restaurant
        Restaurant restaurant = new Restaurant("tasty",4);

        // to create new reviews
        Review review1 = new Review("good food", "lea",3, restaurant);
        Review review2 = new Review("bad experiance", "jina", 1, restaurant);

        // to view restaurant details
        System.out.println("Restaurant details :");
        System.out.println(restaurant);
        System.out.println();

        // to view reviews
        System.out.println("Reviews:");
        System.out.println(review1);
        System.out.println(review2);
        System.out.println();

        // to test add review to restaurant
        Review review3 = new Review("Average experience", "laim", 3,restaurant);
        System.out.println("new review added");
        System.out.println(restaurant);
        System.out.println();






    }
}
