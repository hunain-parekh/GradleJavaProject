package parekhtdd;

import java.util.ArrayList;
public class Cart {
    public Cart(){};

    public ArrayList<QuantityItems> quantityItems = new ArrayList<>();

    public ArrayList<QuantityItems> getItems(){
        return quantityItems;
    }

    public boolean addItem(Item item,int quantity){
        try{
            QuantityItems qItem = new QuantityItems(item, quantity);
            quantityItems.add(qItem);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public int SumOfCart()
    {
        int sum = 0;
        for(QuantityItems quantityItem:quantityItems){
            int quantity = quantityItem.quantity;
            int price = quantityItem.item.price;
            int SubTotal = price * quantity;
            sum += SubTotal;
        }
        return sum;
    }

    public int QuantityOfCart(){
        int quantity = 0;
        for(QuantityItems quantityItem:quantityItems){
            int itemQuanity = quantityItem.quantity;
            quantity += itemQuanity;
        }
        return quantity;
    }
}
