package parekhtdd;

import java.util.ArrayList;

public class Cart {
    public Cart(){};

    public ArrayList<QuantityItems> quantityItems = new ArrayList<>();

    public ArrayList<QuantityItems> getItems(){
        return quantityItems;
    }
}
