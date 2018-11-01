/**
 * Created by Aalx on 10/30/2018.
 */
public class HealthyBurger extends Hamburger {

    public HealthyBurger(){
        this.meat = "beef";
        this.bread = "brown rye bread roll";
        this.hamburger.put(this.meat, 5);
        this.hamburger.put(this.bread, 10);
        this.price = 15;
    }

    public HealthyBurger(String meat, int price){
        this.meat = meat;
        this.bread = "brown rye bread roll";
        hamburger.put(this.meat, price);
        hamburger.put(this.bread, price);
        this.price = 2*price;
    }

    public void addItem(String item){
        if(this.itemAdded < 6) {
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
