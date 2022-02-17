package ca.bcit.comp2522.midterm;

/**
 * Implement your solution to the midterm in this folder.
 *
 * @author BCIT
 * @version 202210
 */
public enum Midterm {
    COMPLETE, IN_PROGRESS, PENDING, ABANDONED
}

final class GoodLuck {

    private GoodLuck() { }

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(final String[] args) {
        System.out.println(Midterm.IN_PROGRESS);
    }
}
