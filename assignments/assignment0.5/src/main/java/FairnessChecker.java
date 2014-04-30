import java.util.List;
import java.util.ArrayList;

/**
 * @class FairnessChecker
 *
 * @brief Class that attempts to check whether the SimpleSemaphore
 *        implementation is "fair".
 */
public class FairnessChecker {
    /**
     * List of the waiting Threads, which are stored in FIFO order to
     * see if the SimpleSemaphore implementation is "fair".
     */
    private List<String> mEntryList;

    /**
     * Initialize the FairnessChecker
     */
    public FairnessChecker(int totalEntries) {
        mEntryList = new ArrayList<String>(totalEntries);
    }

    /**
     * Add the name of a Thread that's about to acquire the @code
     * SimpleSemaphore.  Assumes that Thread name are unique.
     */
    public synchronized void addNewThread(String entry) {
        mEntryList.add(entry);
    }

    /**
     * Returns true if the calling Thread's name is the same as the
     * first item in the list, else false.
     */
    public synchronized boolean checkOrder(String entry) {
        String currentEntry = mEntryList.remove(0);

        return currentEntry.equals(entry);
    }
}

