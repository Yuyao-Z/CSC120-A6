/* This is a stub for the Cafe class */
class Cafe extends Building  {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    // Constructor for Cafe class
    private Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors); 
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    //Getter of the private integer nCoffeeOunces
    public int getnCoffeeOunces(){
        return nCoffeeOunces; 
    }
    //Getter of the private integer nSugarPackets
    public int getnSugarPackets(){
        return nSugarPackets;
    }
    // Getter for the private integer nCreams
    public int getnCreams(){
        return nCreams;
    }
    // Getter of the private integer nCups
    public int getnCpus(){
        return nCups;
    }
    /** 
    *Personalize and sell coffee
     * @param size: integer that represents how many ounces of coffee used
     * @param nSugarPackets: number of Sugar Packets in the coffee sold
     * @param nCreams: amount of creams used in the coffee sold
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if (this.nCoffeeOunces < 0 || this.nSugarPackets < 0 || this.nCreams < 0 || this.nCups < 0) {
            throw new RuntimeException("It runs out of storage.");
        }
    }
    /*refill the stock of coffee, sugar, cream and cups
     * @param nCoffeeOunces: amount of coffee restocked
     * @param nSugarPackets: amount of sugar packets restocked
     * @param nCreams: amount of cream restoked
     * @param nCups: number of cups restocked
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces += nCoffeeOunces;
        nSugarPackets += nSugarPackets;
        nCreams += nCreams;
        nCups += nCups;
    }
    
    public static void main(String[] args) {
        Cafe idontlikecoffeatall = new Cafe(5,4,3,2,"eifheuw","ehfow9u",1);
        idontlikecoffeatall.sellCoffee(1,1,1);
        idontlikecoffeatall.restock(1,2,3,4);    

    }
    
}
