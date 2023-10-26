/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Constructs a Cafe object, which inherits from the Building class.
     * @param name name of the cafe
     * @param address address of the cafe
     * @param floors number of floors in the cafe
     * @param coffee amount of coffee the cafe starts with
     * @param sugar amount of sugar the cafe starts with
     * @param cream amount of cream the cafe starts with
     * @param cups number of cups the cafe starts with
     */
    public Cafe (String name, String address, int floors, int coffee, int sugar, int cream, int cups) {
        super(name, address, floors);
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Sells coffee from a cafe by decreasing its inventory.
     * @param size number of ounces of coffee in an order
     * @param nSugarPackets number of sugar packets in an order
     * @param nCream amount of cream in an order
     */
    public void SellCoffee(int size, int nSugarPackets, int nCream)
    {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups --;
    }

    /**
     * Restocks the inventory of a cafe.
     * @param nCoffeeOunces amount of coffee being added
     * @param nSugarPackets amount of sugar being added
     * @param nCups number of cups being added
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCups)
    {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCups = nCups;
    }
    
    public static void main(String[] args) {
        new Cafe("Compass", "7 Neilson Drive", 1, 0, 0, 0, 0);
    }
    
}
