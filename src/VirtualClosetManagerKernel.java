import components.standard.Standard;

/**
 * @author Joselyn Vasquez
 */
public interface VirtualClosetManagerKernel
        extends Standard<VirtualClosetManager> {

    /**
     * addItem method: This will add new items to the closet.
     *
     * @param item
     * @updates this
     * @requires a item (String)
     * @ensures the item is added to their closet
     */
    void addItem(String item);

    /**
     * Removes item from the closet.
     *
     * @updates this
     * @requires an item(String)
     * @ensures the item item removed from the closet.
     *
     */
    void removeItem();

    /**
     * empies the entire closet.
     *
     * @ensures the closet is cleared
     * @updates this
     * @clears the closet
     */
    void emptyCloset();

    /**
     * gets closet size.
     * 
     * @ensures |closet|>=0
     * @return integer of closet size
     */
    int closetSize();

}
