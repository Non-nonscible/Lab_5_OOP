package flower.store;

import java.util.ArrayList;

public class FlowerBucket {

    private ArrayList<FlowerPack> content = new ArrayList<FlowerPack>();
    public FlowerBucket(){

    }

    void add(FlowerPack pack){
        content.add(pack);
    }

    int getPrice(){
        int res = 0;
        for (FlowerPack elem: content) {
            res += elem.getQuantity() * elem.getFlower().getPrice();
        }
        return res;
    }
}
