package parekhtdd;

import java.math.BigDecimal;

public class Item {
    String name;
    BigDecimal price;
    Boolean onSale;
    public Item(String name,BigDecimal price,Boolean onSale){
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }
}
