
/**
 * @author Joselyn Vasquez
 */
public interface VirtualClosetManager extends VirtualClosetManagerKernel {

    /**
     * Searches the closet by clothing type.
     *
     * @param type
     *            the type of clothing to search for
     * @returns a set of clothing types
     */
    String searchByClothingType(String type);

    //sorting method will be added soon...
}
