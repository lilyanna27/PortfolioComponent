import components.set.Set;
import components.set.Set2;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Virtual Closet Manager.
 */
public class VirtualClosetManager {
    /**
     * Represents the clothing items in the users closet.
     */
    private final Set<String> closet;

    /**
     * Contructor initializes an empty closet to start off with.
     */
    public VirtualClosetManager() {
        this.closet = new Set2<>();
    }

    /**
     * addItem method: This will add new items to the closet.
     *
     * @param item
     */
    public void addItem(String item) {
        this.closet.add(item);
    }

    // method to remove an item
    /**
     * removeItem method: This will remove an item from the closet.
     *
     * @param item
     */

    public void removeItem(String item) {
        this.closet.remove(item);
    }

    /**
     * clears the entire closet.
     */
    public void emptyCloset() {
        this.closet.clear();
    }

    // method for closet size
    /**
     * Gets the current closet size
     *
     * @return integer of the size of the closet
     */
    public int closetSize() {
        return this.closet.size();
    }

    // method to search by clothing type (secondary Method)
    /**
     * Implements searchByClothingType as a secondary method that uses remove
     * and add kernel methods
     *
     * @param type
     * @return a set of matching clothing items
     */
    public Set<String> searchByClothingType(String type) {
        Set<String> result = new Set2<>();
        Set<String> tempCloset = new Set2<>();

        while (this.closet.size() > 0) {
            String item = this.closet.removeAny();
            if (item.toLowerCase().contains(type.toLowerCase())) {
                result.add(item);
            }
            tempCloset.add(item);
        }
        this.closet.add(tempCloset);
        return result;
    }

    // method for outfit recommendation

    // sorting closettttt
    // method to sort the closet by color

    // method for containsItem: this can just check if the closet already has it

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        VirtualClosetManager closet = new VirtualClosetManager();
        // asks user for their items and adds them to the closet if the user says yes.
        out.println("Do you want to add an item to your closet?(y/n)");
        String input = in.nextLine();
        while (input.equalsIgnoreCase("y")) {
            System.out.print("Enter item: ");
            String item = in.nextLine();
            closet.addItem(item);
            System.out.println("Do you want to add another item? (y/n)");
        }
        // User can find the size of their close
        out.println("Current Closet Size: " + closet.closetSize());

        // user can choose to sort their closet

        // user can get rid of an item

        // user can ask for recommendations
        in.close();
        out.close();
    }

}
