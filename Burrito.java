// package Mastery_Projects.ChipotleOrderingSystem;

public class Burrito {
    private String m_size; // kids or regular
    private String m_protein; // chicken, steak, veggie
    private String m_rice; // white, brown, no rice
    private String m_beans; // black, pinto, no beans

    // TRUE OR FALSE
    private boolean m_guac;
    private boolean m_tomatillo;
    private boolean m_sourCream;
    private boolean m_cheese;
    private boolean m_lettuce;


    // A default constructor that creates a default 
    // burrito which is regular-sized with chicken, 
    // white rice, black beans, lettuce and sour cream.
    public Burrito(){
        m_size = "regular";
        m_protein = "chicken";
        m_rice = "white";
        m_beans = "black";
        m_sourCream = true;
        m_lettuce = true;
    }

    
    /**
     * A fully specified, overloaded constructor that sets
     * all of the member variables as given.
     * @param size size of the burrito (kids or regular)
     * @param protein type of protein (chicken, steak, veggie)
     * @param rice type of rice (white, brown, no rice)
     * @param beans type of beans (black, pinto, no beans)
     * @param guac guacamole or no
     * @param tomatillo tomatillo salsa or no
     * @param sourCream sour cream or no
     * @param cheese cheese or no
     * @param lettuce lettuce or no
     */
    public Burrito(String size, String protien, String rice, String beans, boolean guac,  boolean tomatillo, boolean sourCream, boolean cheese, boolean lettuce){
        m_size = size; 
        m_protein = protien; 
        m_rice = rice; 
        m_beans = beans; 
        m_guac = guac;
        m_tomatillo = tomatillo;
        m_sourCream = sourCream;
        m_cheese = cheese;
        m_lettuce = lettuce; 
    }

    /**
     *  A copy constructor using the appropriate shallow or deep copies for member variables.
     *
     * @param burritoToCopy Burrito object to copy from
     */
    public Burrito(Burrito burritoToCopy) {
        m_size = burritoToCopy.m_size;
        m_protein = burritoToCopy.m_protein;
        m_rice = burritoToCopy.m_rice;
        m_beans = burritoToCopy.m_beans;
        m_guac = burritoToCopy.m_guac;
        m_tomatillo = burritoToCopy.m_tomatillo;
        m_sourCream = burritoToCopy.m_sourCream;
        m_cheese = burritoToCopy.m_cheese;
        m_lettuce = burritoToCopy.m_lettuce;
    }
    
    /** A public method named calcCost() that returns a double that is the cost of the Burrito. 
    *
    * @return total cost as a double
    */
    public double calcCost() {
        //size cost
        double cost = 0;
        if (m_size.equals("kids")) {
            cost = 7.00;
        } else {
            cost = 9.00;
        }
    
        //protien cost
        if (m_protein.equals("chicken")) {
            cost += 0.50;
        } else if (m_protein.equals("steak")) {
            cost += 1.25;
        } else if (m_protein.equals("veggie")) {
            cost += 0.50;
        }
    
        //extras cost
        if (m_guac && !m_protein.equals("veggie")) {
            cost += 2.65;
        }
        if (m_sourCream) {
            cost += 0.25;
        }
        if (m_cheese) {
            cost += 0.50;
        }
    
        // Lettuce and tomatillo are free, so no cost added for them
    
        return cost;
    }

    /** 
    * A public method named toString() that returns a String containing
    * the Burrito’s member variable values and cost as calculated by calcCost().
    *
    * @return a String representation of the Burrito
    */
    public String toString() {
        String s = "Burrito Details:\n";
        s += "Size: " + m_size + "\n";
        s += "Protein: " + m_protein + "\n";
        s += "Rice: " + m_rice + "\n";
        s += "Beans: " + m_beans + "\n";
        s += "Extras:\n";
        
        if (m_guac) s += "\t- Guacamole\n";
        if (m_tomatillo) s += "\t- Tomatillo Salsa\n";
        if (m_sourCream) s += "\t- Sour Cream\n";
        if (m_cheese) s += "\t- Cheese\n";
        if (m_lettuce) s += "\t- Lettuce\n";
        
        s += "Total Cost: $" + calcCost() + "\n";
        
        return s;
    }

    /** A public method name equals() that returns a Boolean to determine if two Burritos
    * are “equal.” You can assume two Burritos are equal if they have all the same member variables.
    *
    * @param o object to compare with
    * @return true if two Burritos are same else false
    */

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Burrito)) {
            return false;
        }
        Burrito otherBurrito = (Burrito) o;
        return this.m_size.equals(otherBurrito.m_size) &&
            this.m_protein.equals(otherBurrito.m_protein) &&
            this.m_rice.equals(otherBurrito.m_rice) &&
            this.m_beans.equals(otherBurrito.m_beans) &&
            this.m_guac == otherBurrito.m_guac &&
            this.m_tomatillo == otherBurrito.m_tomatillo &&
            this.m_sourCream == otherBurrito.m_sourCream &&
            this.m_cheese == otherBurrito.m_cheese &&
            this.m_lettuce == otherBurrito.m_lettuce;
    }

    
}
