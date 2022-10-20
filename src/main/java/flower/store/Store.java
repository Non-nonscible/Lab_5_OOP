package flower.store;

import java.util.Hashtable;

public class Store {

    private Hashtable<Flower, Integer> catalog;

    public Store() {
        this.catalog = new Hashtable<>();
    }

    public int search(Flower flower) {
        // Returns the amount of flowers finds in collection
        if (!catalog.containsKey(flower)) {
            return 0;
        }
        return catalog.get(flower);
    }

    public void add(Flower flower, int amount) {
        if (!catalog.containsKey(flower)) {
            catalog.put(flower, amount);
        } else {
            catalog.put(flower, catalog.get(flower) + amount);
        }
    }
}
