package lor_wintracker.src;

public class Hashtable{
    private int m;
    private LinkedList[] lst;

    public Hashtable(){
        this(50);
    }

    public Hashtable(int m){
        this.m = m; //m is the number of linked lists's
        this.lst[0] = new LinkedList();
        for (int i = 0; i < m; i++){
            this.lst[i] = new LinkedList();
        }
    }

    public void add(String name, Card card){
        lst[hash(name)].add(name, card);
    }

    /**
     * @brief Gets the card with the given name
     * @param name is the name of the card to return
     * @return the card with the given name
     */
    public Card get(String name){
        return lst[hash(name)].get(name);
    }

    

    /**
     * @brief Calculates the hash function for a given string key. 
     * @cite This was taken from Robert Sedgewick and Kevin Wayne's 'Algorithms Fourth Edition' textbook.
     * @param name is some String key to be hashed
     * @return the hashcode of a given string
     */
    private int hash(String name){
        return (name.hashCode() & 0x7fffffff) % m;
    }
}