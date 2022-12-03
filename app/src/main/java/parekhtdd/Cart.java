package parekhtdd;

import java.util.ArrayList;
public class Cart {
    public Cart(){};

    public ArrayList<QuantityItems> quantityItems = new ArrayList<>();
    public ArrayList<String> ItemizedList = new ArrayList<>();

    public ArrayList<String> getItems(){
        for(QuantityItems quantityItem:quantityItems){
            if(quantityItem.item.onSale == true){
                ItemizedList.add("Item name: "+quantityItem.item.name+" Quantity: "+quantityItem.quantity+" Price: "+quantityItem.item.price+" highlited");
            }
            else{
                ItemizedList.add("Item name: "+quantityItem.item.name+" Quantity: "+quantityItem.quantity+" Price: "+quantityItem.item.price);
            }
        }
        return ItemizedList;
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

    public boolean removeItem(String name){
        try{
            for(QuantityItems quantityItem:quantityItems){
                if(quantityItem.item.name == name){
                    quantityItems.remove(quantityItem);
                }
            }
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
