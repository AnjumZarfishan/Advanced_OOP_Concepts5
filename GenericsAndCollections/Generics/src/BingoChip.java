public class BingoChip<T1, T2> {

    private T1 things1;
    private T2 things2;

    // The `constructor`
    public BingoChip(T1 things1, T2 things2) {
        this.things1 = things1;
        this.things2 = things2;
    }

    // Override the toString( )
    @Override
    public String toString() {
        // return the string representation of the chip
        return "Chip:" + things1 + "-" + things2;
    }
}

