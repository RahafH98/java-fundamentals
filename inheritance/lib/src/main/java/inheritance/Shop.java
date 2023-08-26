package inheritance;

import java.util.ArrayList;
import java.util.List;

class Shop extends Place {
    private String description;
    private int dollarSigns;

    public Shop(String name, String description, int dollarSigns) {
        super(name);
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return String.format("Shop: %s\nDescription: %s\nDollar Signs: %d", name, description, dollarSigns);
    }
}
