package lor_wintracker.src;

public class LinkedList{
    private Node head;

    /**
     * @brief Represents a node in the linked list, which holds a card and a key for that card
     */
    private class Node{
        String name;
        Card card;
        Node nextNode;

        public Node(String name, Card card){
            this.name = name;
            this.card = card;
            this.nextNode = null;
        }
    }

    /**
     * @brief Inserts a node at the beginning of the linked list
     * @param newName is the name (key) of the card
     * @param newCard is the card object
     */
    public void add(String newName, Card newCard){
        Node newNode = new Node(newName, newCard);
        newNode.nextNode = this.head;
        this.head = newNode;
    }

    /**
     * @brief Returns the card with the given name, if it exists
     * @param name is the name that is being searched for
     * @return Card with the given name, or null if the card is not found in the list
     */
    public Card get(String name){
        Node currNode = head;
        while (currNode != null){
            if (currNode.name == name){
                return currNode.card;
            }
            currNode = currNode.nextNode;
        }
        return null;
    }
}