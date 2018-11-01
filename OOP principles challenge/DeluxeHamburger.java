/**
 * Created by Aalx on 10/30/2018.
 */
public class DeluxeHamburger extends Hamburger {


    public DeluxeHamburger(){
        this.meat = "beef";
        this.bread = "brown rye bread roll";
        hamburger.put(this.meat, 5);
        hamburger.put(this.bread, 5);
        hamburger.put("chips", 10);
        hamburger.put("drink", 10);
        this.price = 10;
    }

    public DeluxeHamburger(String meat, int price){
        this.meat = meat;
        this.bread = "white";
        this.price = 2*price;
        hamburger.put(this.meat, price);
        hamburger.put(this.bread, price);
        hamburger.put("chips", 10);
        hamburger.put("drink", 10);
    }

    @Override
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
