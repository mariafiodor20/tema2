import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Aalx on 10/30/2018.
 */
public class Hamburger {
    protected String meat;
    protected String bread;
    protected HashMap<String, Integer> hamburger = new HashMap<String, Integer>();
    protected int price;
    protected int itemAdded = 0;

    public Hamburger(){

    }

    public Hamburger(String meat, String bread, int price){
        this.meat = meat;
        this.bread = bread;
        this.price = price;
        hamburger.put(this.meat, 5);
        hamburger.put(this.bread, 5);
    }

    public void addItem(String item){
        if(this.itemAdded < 4) {
            this.hamburger.put(item, 10);
        }
        else
            System.out.println("Too many items added");
    }

    public void showBurger(){
        int sum = 0;
        for (String e:this.hamburger.keySet()) {
            System.out.println(e + "=" + this.hamburger.get(e));
            sum += this.hamburger.get(e);
        }
        System.out.println("\nIntial price " + this.price);
        System.out.println("Final price " + sum + "\n");

    }





}
