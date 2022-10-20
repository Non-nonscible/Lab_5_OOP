package flower.store;

import java.util.Hashtable;

public class Store {

    private Hashtable<Flower, Integer> catalog;

    public Store() {
        this.catalog = new Hashtable<>();
    }

    public String search(Flower flower) {
        if (!catalog.containsKey(flower)) {
            return "There is this type of flower in the store.";
        }
        return ("There is" + catalog.get(flower) + "flowers of this type.");
    }

    public void add(Flower flower, int amount) {
        if (!catalog.containsKey(flower)) {
            catalog.put(flower, amount);
        } else {
            catalog.put(flower, catalog.get(flower) + amount);
        }
    }
}
