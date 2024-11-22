public class BurritoOrder {
    // A private member variable, m_order, which is an array of base type Burrito. Each element saved in this array should be a Burrito object.
    // A private member variable, m_numBurritos, which tells how many Burritos are currently in the order
    // A private member variable, m_numBurritosMax, which tells how many Burritos there will be in the order total (size of the m_order array)
    private Burrito[] m_order; 
    private int m_numBurritos;  
    private int m_numBurritosMax; 

    //Default constructor which defaults to an order of a single default Burrito.
    public BurritoOrder() {
        this.m_numBurritosMax = 1; 
        this.m_order = new Burrito[m_numBurritosMax];
        this.m_order[0] = new Burrito(); 
        this.m_numBurritos = 1; 
    }

    /** Overloaded constructor that takes an integer parameter that tells how many Burritos will be added to the order and initializes the order 
    * instance variable to an empty Burrito array of that size.
    *
    * @param numBurritosMax maximum number of Burritos in order
    */
    public BurritoOrder(int numBurritosMax) {
        this.m_numBurritosMax = numBurritosMax;
        this.m_order = new Burrito[m_numBurritosMax];
        this.m_numBurritos = 0; 
    }

    /** public int addBurrito(Burrito b)— add the parameter Burrito object to the BurritoOrder’s m_order member variable. Given that the order is
     * saved as a Burrito array, remember that once the order is full you will not be able to add more Burrito! Implement this method to indicate 
     * that adding the additional Burrito was unsuccessful. If the addition was successful the method should return a 1 and if unsuccessful (array is full) return -1.
     *
     * @param b the Burrito to add
     * @return 1 if order was success, -1 if not
     */
    public int addBurrito(Burrito b) {
        if (m_numBurritos < m_numBurritosMax) {
            m_order[m_numBurritos] = b; 
            m_numBurritos++; 
            return 1; // if order is a success
        } else {
            return -1; // if order is full
        }
    }

    /** public double calcTotal() — returns the total cost of the order by adding up the prices of each Burrito in the order (hint: use the calcCost
     * method from the Burrito class for each Burrito object in the m_order array)
     *
     * @return total cost of the order
     */
    public double calcTotal() {
        double total = 0.0;
        for (int i = 0; i < m_numBurritos; i++) {
            total += m_order[i].calcCost(); 
        }
        return total; 
    }

    /** public String toString()— returns a String representing this order, so that the employee at Chipotle can repeat the order back to you before sending it to be prepared. This method should begin by calling the calcTotal() method so that the total price of the order can be displayed at the top. 
     * Then, it should list all of the details of all Burritos in the order.
     *
     * @return String version of order
     */
    public String toString() {
        String s = "Total Cost: $" + calcTotal() + "\n";
        s += "Burrito Order Details:\n";
        for (int i = 0; i < m_numBurritos; i++) {
            s += m_order[i].toString() + "\n"; 
        }
        return s;
    }
    
}
